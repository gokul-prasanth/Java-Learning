package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find the exponent modulo n
 * 
 * Given 2 integers x and n, you have to calculate x to the power of n, modulo 10^9+7 i.e. calculate (x^n) % (10^9+7).
 * In other words, you have to find the value when x is raised to the power of n, and then modulo is taken with 10^9+7.
 * a%b means the remainder when a divides b. For instance, 5%3 = 2, as when we divide 5 by 3, 2 is the remainder.
 * Note that 10^9 is also represented as 1e9.
 */
public class ModularExponentiation {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int p = 1000000000;
		int ans = exponentMod(x, n, p+7);
		System.out.println(ans);
	}


	static int exponentMod(int A,
			int B, int C)
	{
		// Base cases
		if (A == 0)
			return 0;
		if (B == 0)
			return 1;

		// If B is even
		long y;
		if (B % 2 == 0)
		{
			y = exponentMod(A, B / 2, C);
			y = (y * y) % C;
		}

		// If B is odd
		else
		{
			y = A % C;
			y = (y * exponentMod(A, B - 1,
					C) % C) % C;
		}

		return (int)((y + C) % C);
	}
}
