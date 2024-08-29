package com.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3030/java_batch", "root", "1212");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}
}
