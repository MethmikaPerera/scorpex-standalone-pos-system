package service;

import database.MySQL;
import entity.Employee;
import entity.EmployeeRole;

import java.sql.ResultSet;

public class EmployeeLoginService {





    public Employee userAuthentication(String email, String password) throws Exception {
            String query = "SELECT * FROM employee WHERE email = '" + email + "' AND password = '" + password + "'";
            ResultSet user = MySQL.executeQuery(query);

            if (user.next()) {
                // User found, process the result
                System.out.println("User found: " + user.getString("name"));

                String empId = user.getString("emp_id");
                String name = user.getString("name");
                String userEmail = user.getString("email");
                String userPassword = user.getString("password");
                EmployeeRole role = getUserRole(user.getString("role_id"));

                Employee authenticateUser = new Employee(empId, name, userEmail, userPassword,role);
                return authenticateUser;
            } else {
                // No user found
                System.out.println("User not found");
                throw new Exception("User not found");
            }
    }

    public EmployeeRole getUserRole(String userRole) throws Exception {

        String queryRole = "SELECT * FROM user_role WHERE role = '" +userRole + "'";
        ResultSet role = MySQL.executeQuery(queryRole);

        if (role.next()) {
            int roleId = role.getInt("role_id");
            String roleName = role.getString("type");
            return new EmployeeRole(roleId,roleName);
        } else {
            return null;
        }

    }
}