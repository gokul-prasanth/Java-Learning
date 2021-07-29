package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Reorder the string
 * 
 * Given a string, you have to rearrange the characters of the string in the given order. A reordering of characters of a string is called a permutation of the string.
 * 
 * The order is in the form of an integer array with size same as that of string, in which each integer specifies the new position of the character currently present at that particular place.
 * 
 * For eg. consider the string "abcd" and permutation [2,4,3,1], then the new string will be "dacb".
 */
public class StringPermutation {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();
		int permutation[] = new int[n];

		for (int i = 0; i < n; i++)
			permutation[i] = sc.nextInt();

		String result = stringPermutation(n, str, permutation);

		System.out.println(result);

	}

	static String stringPermutation(int n, String str, int[] permutation) {
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < n; i++) {
			char temp = str.charAt(i);
			sb.setCharAt(permutation[i]-1, temp);
		}
		return sb.toString();
	}
}