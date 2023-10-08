package studychess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import studychess.enums.UserRole;
import studychess.models.UserModel;
import studychess.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findByLogin(username);
	}


	public UserDetails saveUser(String name, String password, UserRole role) {
		UserModel newUser = new UserModel(name, password, role);
		return repository.save(newUser);

	}
	
}
