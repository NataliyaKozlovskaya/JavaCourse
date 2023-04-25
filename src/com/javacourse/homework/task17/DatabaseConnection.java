package com.javacourse.homework.task17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    private DatabaseConnection() {
    }

    public static Connection create() throws SQLException {
        if (connection == null) {
            Connection connection = DriverManager.getConnection("any url");
        }
        return connection;
    }
}
