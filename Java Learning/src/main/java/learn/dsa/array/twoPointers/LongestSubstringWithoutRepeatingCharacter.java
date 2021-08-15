package learn.dsa.array.twoPointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 09, 2021
 * 
 * Find the longest substring with no repeating characters
 * 
 * Given a string, find the length of the longest substring which has no repeating characters.
 * 
 */
public class LongestSubstringWithoutRepeatingCharacter {
	static final int NO_OF_CHARS = 256;

	public int lengthOfLongestSubstring(String str) {
		int n = str.length();

		int longestSubstringLength = 0; // result

		// last index of all characters is initialized
		// as -1
		int [] lastIndex = new int[NO_OF_CHARS];
		Arrays.fill(lastIndex, -1);

		// Initialize start of current window
		int i = 0;

		// Move end of current window
		for (int j = 0; j < n; j++) {

			// Find the last index of str[j]
			// Update i (starting index of current window)
			// as maximum of current value of i and last
			// index plus 1
			i = Math.max(i, lastIndex[str.charAt(j)] + 1);

			// Update result if we get a larger window
			longestSubstringLength = Math.max(longestSubstringLength, j - i + 1);

			// Update last index of j.
			lastIndex[str.charAt(j)] = j;
		}
		return longestSubstringLength;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int result = new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring(s);
		System.out.println(result);
	}
}
