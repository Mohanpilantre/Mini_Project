package com.project;

import java.sql.SQLException;
import java.util.Scanner;

public class DashBord {

	public void dashBord() throws SQLException, InviledStudentUser {

		System.out.println("Welcome to Quiz based application");
		System.out.println("1. Student Registration");
		System.out.println("2. Student Login");
		System.out.println("3. Display the list of questions");
		System.out.println("4. Store Quiz result into database");
		System.out.println("5. Display Quiz result ");
//		System.out.println("6. Display all students score as per ascending order");
//		System.out.println("7. Fetch student score by using id");
//		System.out.println("8. Add question with 4 options into database");

		Scanner scan = new Scanner(System.in);
		int number = 10;
		while (number != 0) {
			int choise = scan.nextInt();
			switch (choise) {
			case 1:
				StudentDetails studentDetails = new StudentDetails();
				studentDetails.getData();
				break;

			case 2:
				StudentLogin studentLogin = new StudentLogin();
				studentLogin.stdLogin();
				break;

			case 3:
				Question question = new Question();
				question.questionData();
				break;
			default:
				System.out.println("Please Enter valied input");
			}
		}
	}
}
