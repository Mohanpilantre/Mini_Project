package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDetails {

	public void getStudInfo(String firstname, String lastname, String username, String password, String city,
			String mailId, String mobileNumber) throws SQLException {

		Connection connection = DataBaseConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(
				"insert into student(firstname,lastname,username,password,city,mailid,mobilenumber)values(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, firstname);
		preparedStatement.setString(2, lastname);
		preparedStatement.setString(3, username);
		preparedStatement.setString(4, password);
		preparedStatement.setString(5, city);
		preparedStatement.setString(6, mailId);
		preparedStatement.setString(7, mobileNumber);
		int k = preparedStatement.executeUpdate();
		System.out.println("Registration Successfully Done..... "  + k);
			
		

	}

	public void getData() throws SQLException {

		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the firstname ");
		student.firstName = scan.next();
		System.out.println("Enter the lastname ");
		student.lastName = scan.next();
		System.out.println("Enter the Username ");
		student.userName = scan.next();
		System.out.println("Enter the  password");
		student.password = scan.next();
		System.out.println("Enter the city");
		student.city = scan.next();
		System.out.println("Enter Email");
		student.mailId = scan.next();
		System.out.println("Enter mobile number");
		student.mobileNumber = scan.next();
		getStudInfo(student.firstName, student.lastName, student.userName, student.password, student.city,
				student.mailId, student.mobileNumber);
	}

}
