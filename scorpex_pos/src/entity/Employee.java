package entity;

public class Employee {

    private String empId;
    private String name;
    private String email ;
    private String password;
    private EmployeeRole role;

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

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    public Employee(String empId, String name, String email, String password) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Employee(String empId, String name, String email, String password, EmployeeRole role) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}