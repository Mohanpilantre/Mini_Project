package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentLogin {

	public void login(String user, String password) throws InviledStudentUser, SQLException {
		Connection connection = DataBaseConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id='2'");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
				System.out.println("Username " + resultSet.getString("username"));
				System.out.println("Password " + resultSet.getString("password"));
		}

	}

	public void stdLogin() throws InviledStudentUser, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name");
		String userName = scan.next();
		System.out.println("Enter password");
		String pass = scan.next();

		login(userName, pass);

	}
}
