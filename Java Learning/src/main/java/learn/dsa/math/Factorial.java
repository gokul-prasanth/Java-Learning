package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Factorial of given number
 * 
 * Given a number n, you have to calculate the factorial of that number.
 * Note : No inbuilt function to be used
 */
public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);

		System.out.println(result);
	}

	static int factorial(int n) {
		int res = 1;

		if(n == 0) {
			return 1;
		}
		while(n > 0) {
			res *= n;
			n--;
		}

		return res;
	}
}
