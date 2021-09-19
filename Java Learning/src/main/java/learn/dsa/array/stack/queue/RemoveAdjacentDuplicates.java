package learn.dsa.array.stack.queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Gokul A
 * @createdOn Sep 19, 2021
 * 
 * Remove duplicates from string
 * 
 * Problem Description
You are given a string s, consisting of lowercase letters. You need to make duplicate removal on s until you no longer can.


A duplicate removal consists of choosing two adjacent equal characters and removing both of them.
Return the final string after all such duplicate removals have been made.
Input format
The first line contains a single string s.

Output format
Print the final string after duplicate removals.

Function definition
You have to complete the given function. It accepts one argument -the input string, and returns the updated string.

Sample Input 1
abbaca

Sample Output 1
ca

Explanation
Initial String: abbaca

After removing "bb" : aaca

After removing "aa" : ca (There are no more duplicates)

Constraints
1 <= |s| <= 10^5
 */
public class RemoveAdjacentDuplicates {

	static String removeAdjacentDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(!stack.empty() && stack.peek()==s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String result = removeAdjacentDuplicates(s);
		System.out.println(result);

		sc.close();
	}


}
