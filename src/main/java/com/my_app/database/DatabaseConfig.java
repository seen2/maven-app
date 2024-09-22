package com.my_app.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseConfig {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);

    public static Properties getProperties() {
        Properties props = new Properties();
        logger.info("Working Directory = {}", System.getProperty("user.dir"));
        try (FileInputStream fis = new FileInputStream("/workspaces/my-app/src/main/resources/database.properties")) {
            props.load(fis);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return props;
    }
}
