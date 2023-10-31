package com.proyecto.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String JDBC_URL = "jdbc:mysql://localhost:7750/parqueadero";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
