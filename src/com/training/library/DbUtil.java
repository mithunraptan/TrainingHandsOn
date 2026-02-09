package com.training.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	 public static Connection getConnection() {
	        String url = "jdbc:postgresql://localhost:5432/testdb";
	        String username = "postgres";
	        String password = "mithun";

	        Connection conn = null;

	        try {
	            conn = DriverManager.getConnection(url, username, password);
	            System.out.println("Database connected successfully");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return conn;
	    }

}
