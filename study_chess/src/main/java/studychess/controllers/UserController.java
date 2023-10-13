package studychess.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import studychess.controllers.middlewares.ValidatePassword;
import studychess.dto.AuthenticationDTO;
import studychess.dto.LoginResponseDTO;
import studychess.dto.RegisterDTO;
import studychess.enums.UserRole;
import studychess.exceptions.InvalidPasswordException;
import studychess.models.UserModel;
import studychess.services.UserService;
import studychess.services.JwtService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("authentication")
public class UserController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtService jwtService;
	@Autowired
	private UserService userService;
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody @Valid AuthenticationDTO data) {
		var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
		var auth = this.authenticationManager.authenticate(usernamePassword);
		var token = jwtService.generateToken((UserModel) auth.getPrincipal());

		return ResponseEntity.ok(new LoginResponseDTO(token));
	}
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody @Valid RegisterDTO data) {
		try {
			if(userService.loadUserByUsername(data.login()) != null)
				return ResponseEntity.badRequest().body("Este usuário já existe no banco de dados.");

			ValidatePassword.isValidPassword(data.password());

			String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());

			userService.saveUser(data.login(), encryptedPassword, UserRole.STUDENT);

			return ResponseEntity.ok().build();

		} catch(InvalidPasswordException exception) {
			return ResponseEntity.badRequest().body(exception.getMessage());
		}
	}
	@PostMapping("/register/admin")
	public ResponseEntity<String> registerAdmin(@RequestBody @Valid RegisterDTO data) {
		try {

			if(userService.loadUserByUsername(data.login()) != null)
				return ResponseEntity.badRequest().body("Este usuário já existe no banco de dados.");

			ValidatePassword.isValidPassword(data.password());

			String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());

			userService.saveUser(data.login(), encryptedPassword, UserRole.ADMIN);

			return ResponseEntity.ok().build();

		} catch(InvalidPasswordException exception) {
			return ResponseEntity.badRequest().body(exception.getMessage());
		}
	}
}
