package studychess.models;

import java.util.Collection;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import studychess.enums.UserRole;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name= "user")
@Table(name = "user")
public class UserModel implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "login", nullable = false, length = 200)
	private String login;

	@Column(name = "password", nullable = false, length = 200)
	private String password;

	@Column(name = "role", nullable = false)
	private UserRole role;

	public UserModel(String login, String password, UserRole role) {
		this.login = login;
		this.password = password;
		this.role = role;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if(this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
		else return List.of(new SimpleGrantedAuthority("ROLE_STUDENT"));
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() { return null; }

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
