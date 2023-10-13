package studychess.enums;

public enum UserRole {
    ADMIN("admin"),
    ALUNO("aluno");
    private String role;
    UserRole(String role) {
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public String getAuthority(){
        return "ROLE_" + role.toUpperCase();
    }
}
