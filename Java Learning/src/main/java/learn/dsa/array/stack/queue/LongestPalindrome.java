package learn.dsa.array.stack.queue;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn Sep 19, 2021
 * 
 * Find the longest palindrome from a given string
 * 
 * Problem Description
You are given a string consisting of lower and upper case characters.
You need to find the length of the longest palindrome which you can create by using the characters from the string.
Note: Upper case and lower case characters are different from each other i.e, "Aa" is not a palindrome as 'A' != 'a'.

Input format
There are 2 lines of input

First line contains the size of the string

Second line contains the string.

Output format
Print the length of the longest palindrome possible.

Sample Input 1
4 bbde

Sample Output 1
3

Explanation
The possible 3 size palindrome strings are :- beb and bdb

Constraints
1 <= Size of String <= 10^4
 */
public class LongestPalindrome {
	
	static int longestPalindrome(int n, String s) {

		return n;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int res = longestPalindrome(n, s);

		System.out.println(res);
	}

}
