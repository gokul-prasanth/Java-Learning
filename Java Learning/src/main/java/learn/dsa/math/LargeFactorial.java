package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Factorial of a large number
 * 
 * Given a single integer, find its factorial. 
 * Since factorials of large numbers cannot be stored in a primitive data type, you have to return the answer as an array of digits, instead of a single number.
 */
public class LargeFactorial {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = largeFactorial(n);

    }

    static int[] largeFactorial(int n) {

		int[] result = new int[500];

		//Initialize result
		result[0] = 1;
		int result_size = 1;

		// Apply simple factorial formula
		// n! = 1 * 2 * 3 * 4...*n
		for (int x = 2; x <= n; x++) {
			result_size = multiply(x, result, result_size);
		}

		for (int i = result_size - 1; i >= 0; i--)
			System.out.print(result[i]);

		return result;
	}

	private static int multiply(int x, int[] result, int result_size) {
		int carry = 0;
		for(int i = 0; i < result_size; i++) {
			int prod = result[i] * x + carry;
			carry = prod / 10;
			result[i] = prod % 10;
		}

		while (carry!=0)
		{
			result[result_size] = carry % 10;
			carry = carry / 10;
			result_size++;
		}
		return result_size;
	}


}
