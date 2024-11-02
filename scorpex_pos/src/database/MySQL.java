package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MySQL {
    private static Connection connection;

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/scorpex_pos";
    private static final String USER = "root";
    private static final String PASSWORD = "Akinda@2004";


    // Constructor
    public static void getConnection() throws Exception {
        if (connection == null) {
            try {
                // Initialize the connection
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (Exception e) {
                System.out.println("Failed to establish a database connection.");
                e.printStackTrace();
            }
        }
    }

    // Close the connection
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (Exception e) {
                System.out.println("Failed to close the database connection.");
                e.printStackTrace();
            }
        }
    }

    public static ResultSet executeSearch(String query) throws Exception {
        getConnection();
        return connection.createStatement().executeQuery(query);
    }

    public static Integer executeIUD(String query) throws Exception {
        getConnection();
        return connection.createStatement().executeUpdate(query);
    }
}