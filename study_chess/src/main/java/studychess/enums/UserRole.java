package studychess.enums;

public enum UserRole {
    ADMIN("ADMIN"),
    STUDENT("STUDENT");
  
    private String role;
  
    UserRole(String role) {
        this.role = role;
    }
  
    public String getRole(){
        return role;
    }
}
