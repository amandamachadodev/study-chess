package studychess.models;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import studychess.enums.UserRole;

@AllArgsConstructor
@Data
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
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if(this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
		else if(this.role == UserRole.ALUNO) return List.of(new SimpleGrantedAuthority("ROLE_ALUNO"));
		else return List.of(new SimpleGrantedAuthority("ROLE_CONVIDADO"));
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
