package com.my_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.my_app.database.DatabaseConnection;
import com.my_app.dto.User;

public class UserDao { // Example Data Access Object (DAO)

    //get all users
    public List<User> getUserses() {
        String sql = "SELECT * FROM users";
        List<User> users = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
              System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
              System.out.println(resultSet.toString());
              System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                while (resultSet.next()) { // Iterate through the ResultSet
                    // Create a User object for each row
                    User user = new User();
                    user.setName(resultSet.getString("name"));
                    user.setEmail(resultSet.getString("email"));
                    user.setPassword(resultSet.getString("password"));
                    // ... set other properties from the ResultSet

                    users.add(user); // Add the User object to the list
                }
            }
        } catch (SQLException e) {
            System.err.println("Error accessing database: " + e.getMessage());
            // Handle the exception appropriately (e.g., log, throw a custom exception)
        }

        return users;

    }

    public void getUserById(int userId) {
        String sql = "SELECT * FROM users WHERE id = ?"; // Example SQL query

        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, userId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Process the result set
                    String username = resultSet.getString("username");
                    // ... get other columns
                    System.out.println("User: " + username);
                } else {
                    System.out.println("User not found.");
                }
            }

        } catch (SQLException e) {
            System.err.println("Error accessing database: " + e.getMessage());
            // Handle the exception appropriately (e.g., log, throw a custom exception)
        }
    }
}
