package service;

import database.MySQL;
import entity.Employee;
import entity.EmployeeRole;
import java.awt.Frame;

import java.sql.ResultSet;

public class LoginService {

    public void adminAuthentication(String username, String password, Frame window) throws Exception {
            String query = "SELECT * FROM employee WHERE email = '" + username + "' AND password = '" + password + "'";
            ResultSet user = MySQL.executeSearch(query);

            if (user.next()) {
                // User found, process the result
                System.out.println("User found: " + user.getString("name"));

                String empId = user.getString("emp_id");
                String name = user.getString("name");
                String userEmail = user.getString("email");
                String userPassword = user.getString("password");
                EmployeeRole role = getUserRole(user.getString("employee_role_role_id"));
                
                System.out.println("Success" + empId + name + role);

                window.dispose();
            } else {
                // No user found
                System.out.println("User not found");
                throw new Exception("User not found");
            }
    }
    
    public void employeeAuthentication(String email, String password, Frame window) throws Exception {
            String query = "SELECT * FROM employee WHERE email = '" + email + "' AND password = '" + password + "'";
            ResultSet user = MySQL.executeSearch(query);

            if (user.next()) {
                // User found, process the result
                System.out.println("User found: " + user.getString("name"));

                String empId = user.getString("emp_id");
                String name = user.getString("name");
                String userEmail = user.getString("email");
                String userPassword = user.getString("password");
                EmployeeRole role = getUserRole(user.getString("employee_role_role_id"));
                
                System.out.println("Success" + empId + name + role);

                window.dispose();
            } else {
                // No user found
                System.out.println("User not found");
                throw new Exception("User not found");
            }
    }

    public EmployeeRole getUserRole(String userRole) throws Exception {

        String queryRole = "SELECT * FROM employee_role WHERE role_id = '" +userRole + "'";
        ResultSet role = MySQL.executeSearch(queryRole);

        if (role.next()) {
            String roleId = role.getString("role_id");
            String roleName = role.getString("type");
            return new EmployeeRole(roleId,roleName);
        } else {
            return null;
        }

    }
}