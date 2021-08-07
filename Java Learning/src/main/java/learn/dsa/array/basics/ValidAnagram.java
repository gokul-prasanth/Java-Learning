package learn.dsa.array.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gokul A
 * @createdOn August 07, 2021
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * Note: You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {

	public boolean validAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < s.length(); i++) {
			sum1+= (int)(s.charAt(i));
		}
		for (int i = 0; i < t.length(); i++) {
			sum2+= (int)(t.charAt(i));
		}
		if(sum1 == sum2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		String t = in.readLine();

		boolean result = new ValidAnagram().validAnagram(s, t);
		System.out.print(String.valueOf(result));
	}
}