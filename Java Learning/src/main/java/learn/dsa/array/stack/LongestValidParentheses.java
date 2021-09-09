package learn.dsa.array.stack;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn Sep 09, 2021
 * 
 * Find length of longest valid parentheses substring
 * 
 * Problem Description
Given a string S containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Input format
First line contains a string - The string S.

Output format
Print the length of the longest valid substring.

Sample Input 1
()(()(())

Sample Output 1
6

Explanation
The last 6 characters of the string forms the longest valid substring i.e. "()(())".

Constraints
0 <= length of string <= 10^5

 */
class LongestValidParentheses{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int ans = longestValidParentheses(S);
		System.out.println(ans);
		sc.close();
	}

	static int longestValidParentheses(String s){
		return 0;
	}
}
