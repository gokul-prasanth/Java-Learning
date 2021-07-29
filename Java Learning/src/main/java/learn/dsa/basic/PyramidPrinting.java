package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given a number n, you have to print a triangle-shaped pattern with n rows using '*'.

For eg. if n = 4 pattern will be:

 *
 * *
 * * *
 * * * *

 */
public class PyramidPrinting {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] pattern = pyramidPrinting(n);

		for (int i = 0; i < n; i++)
			System.out.println(pattern[i]);

	}

	static String[] pyramidPrinting(int n) {
		String[] result = new String[n];
		result[0] = "*";
		for(int i = 1; i<n; i++) {
			int temp = i;
			StringBuilder stars = new StringBuilder();
			while(temp != 0) {
				stars.append("* ");
				temp--;
			}
			stars.append("*");
			result[i] = stars.toString();
		}
		return result;
	}
}
