package com.my_app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 

    public static Connection getConnection() throws SQLException {
        try {
            // Load the JDBC driver
            Class.forName(JDBC_DRIVER); 

            // Get connection properties (either directly or from the properties file)
            Properties props = DatabaseConfig.getProperties(); // If you're using a properties file
            String dbUrl = props.getProperty("db.url");
            String dbUser = props.getProperty("db.user");
            String dbPassword = props.getProperty("db.password");

            // Establish the connection
            return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found: " + e.getMessage());
            throw new SQLException("MySQL JDBC driver not found", e);
        }
    }
}
