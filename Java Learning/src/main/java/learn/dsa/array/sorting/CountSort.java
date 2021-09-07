package learn.dsa.array.sorting;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 *  Implement Count sort on given string
 *  
 *  A string S is given consisting of lowercase alphabetical characters only. 
 *  You need to return a sorted string using Count Sort.
 *  
 */
class CountSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		String res = countSort(n, s);

		System.out.println(res);
        sc.close();
	}

	static String countSort(int n, String s) {

		char arr[] = s.toCharArray();

		// The output character array that will have sorted arr
		char output[] = new char[n];

		// Create a count array to store count of inidividul
		// characters and initialize count array as 0
		int count[] = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		// store count of each character
		for (int i = 0; i < n; ++i)
			++count[arr[i]];

		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		// Build the output character array
		// To make it stable we are operating in reverse order.
		for (int i = n - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}

		StringBuilder result = new StringBuilder();
		// Copy the output array to arr, so that arr now
		// contains sorted characters
		for (int i = 0; i < n; ++i) {
			result.append(output[i]);
		}
		
		return result.toString();
		
		
	}
}
