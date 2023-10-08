package studychess.dto;

import studychess.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
