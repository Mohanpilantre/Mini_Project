//package com.project;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class GetStudent {
//
//	public void studentData() throws SQLException, ClassNotFoundException {
//
//		Connection connection = DataBaseConnection.getConnection();
//		PreparedStatement preparedStatemen = connection
//				.prepareStatement("select * from student where id='1'");
//
//		ResultSet resultSet = preparedStatemen.executeQuery();
//		while (resultSet.next()) {
//			System.out.println("Id" + resultSet.getInt(1));
//			System.out.println("Name" +resultSet.getString(2));
//			System.out.println("Password" + resultSet.getString(3));
//			System.out.println("city" + resultSet.getString(4));
//
//		}
//	}
//
//}
