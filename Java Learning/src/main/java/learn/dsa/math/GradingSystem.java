package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * A school has following rules for grading system:
 * 
 * [0, 25) - F
 * 
 * [25, 45) - E
 * 
 * [45, 50) - D
 * 
 * [50, 60) - C
 * 
 * [60, 80) - B
 * 
 * [80, 100] - A
 * 
 * If the input is less than 0 or greater than 100 then it is considered invalid.
 * 
 * You are given a real number score, print the corresponding grade or "Invalid" if the input is invalid.
 */
public class GradingSystem {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		float marks = sc.nextFloat();
		String result = gradingSystem(marks);

		System.out.println(result);

	}

	static String gradingSystem(float marks) {

		if(marks<0 || marks > 100) {
			return "Invalid"; 
		} else if (marks>=0 && marks < 25) {
			return "F";
		} else if (marks>=25 && marks < 45) {
			return "E";
		} else if (marks>=45 && marks < 50) {
			return "D";
		} else if (marks>=50 && marks < 60) {
			return "C";
		} else if (marks>=60 && marks <80) {
			return "B";
		} else if (marks>=80 && marks <=100) {
			return "A";
		}

		return "";
	}
}

