package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find the largest number
 * 
 * Given 3 numbers a,b,c. Find the largest among them.
 * 
 * Note : No inbuilt function to be used to find the maximum.
 */
public class FindLargestNumber {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float result = findLargestNumber(a, b, c);

		if (result - (int) result == 0.0)
			System.out.println((int) result);
		else
			System.out.println(result);

	}

	static float findLargestNumber(float a, float b, float c) {
		float largest = a;

		if(b > largest) {
			largest = b;
		}

		if(c > largest) {
			largest = c;
		}
		return largest;
	}
}
