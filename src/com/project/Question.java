package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question {

	public void questionData() throws SQLException {

		Connection connection = DataBaseConnection.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into question(questions,A,B,C,D)values(?,?,?,?,?)");
		preparedStatement.setString(1, " Which of the following is a reserved keyword in Java?");
		preparedStatement.setString(2, "object");
		preparedStatement.setString(3, "strictfp");
		preparedStatement.setString(4, "main");
		preparedStatement.setString(5, "system");

		int a = preparedStatement.executeUpdate();
		System.out.println("Questions" + a);
	}
}
