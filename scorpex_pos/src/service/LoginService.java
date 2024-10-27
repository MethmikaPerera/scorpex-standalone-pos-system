package service;

import database.DBConnector;
import entity.User;
import entity.UserRole;

import java.sql.ResultSet;

public class LoginService {





    public User userAuthentication(String email, String password) throws Exception {
            String query = "SELECT * FROM employee WHERE email = '" + email + "' AND password = '" + password + "'";
            ResultSet user = DBConnector.executeQuery(query);

            if (user.next()) {
                // User found, process the result
                System.out.println("User found: " + user.getString("name"));

                String empId = user.getString("empId");
                String name = user.getString("name");
                String userEmail = user.getString("email");
                String userPassword = user.getString("password");
                UserRole role = getUserRole(user.getString("role"));

                User authenticateUser = new User(empId, name, userEmail, userPassword,role);
                return authenticateUser;
            } else {
                // No user found
                System.out.println("User not found");
                throw new Exception("User not found");
            }
    }

    public UserRole getUserRole(String userRole) throws Exception {

        String queryRole = "SELECT * FROM user_role WHERE role = '" +userRole + "'";
        ResultSet role = DBConnector.executeQuery(queryRole);

        if (role.next()) {
            int roleId = role.getInt("id");
            String roleName = role.getString("role");
            return new UserRole(roleId,roleName);
        } else {
            return null;
        }

    }
}