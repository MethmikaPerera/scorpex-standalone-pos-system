package entity;

public class User {

    private String empId;
    private String name;
    private String email ;
    private String password;
    private UserRole role;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public User(String empId, String name, String email, String password) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String empId, String name, String email, String password, UserRole role) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}