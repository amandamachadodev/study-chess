package studychess.enums;

public enum UserRole {
    ADMIN("admin"),
    ALUNO("aluno"),
    CONVIDADO("convidado");

    private String role;

    UserRole(String role) {
        this.role = role;
    }
}
