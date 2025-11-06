package com.tas_c;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvLoader {
    private static String host;
    private static String user;
    private static String password;
    private static String database;

    static {
        try {
            // 1. Check environment variables first
            host = System.getenv("MYSQL_HOST");
            user = System.getenv("MYSQL_USER");
            password = System.getenv("MYSQL_PASSWORD");
            database = System.getenv("MYSQL_DATABASE");

            // 2. If any are missing, fall back to .env
            if (host == null || user == null || password == null || database == null) {
                Properties props = new Properties();
                try (FileInputStream fis = new FileInputStream(".env")) {
                    props.load(fis);
                }

                if (host == null) host = props.getProperty("MYSQL_HOST");
                if (user == null) user = props.getProperty("MYSQL_USER");
                if (password == null) password = props.getProperty("MYSQL_PASSWORD");
                if (database == null) database = props.getProperty("MYSQL_DATABASE");
            }

        } catch (IOException e) {
            System.err.println("Error loading MySQL credentials: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    // Getters
    public static String getHost() { return host; }
    public static String getUser() { return user; }
    public static String getPassword() { return password; }
    public static String getDatabase() { return database; }
}
