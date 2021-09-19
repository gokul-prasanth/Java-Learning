package learn.dsa.array.stack.queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Gokul A
 * @createdOn Sep 19, 2021
 * 
 * Find next smaller element
 * 
 * Problem Description
Given an array, print the next smaller element for every element. The next smaller element for an element x is the first smaller element on the right side of x in the array. Elements for which no next smaller element exists, consider it as -1.

Input format
First line contains an integer N - The size of the array.

Second line contains N space separated integers - The given array.

Output format
Print in a single line, the next greater element for each array element separated by space.

Sample Input 1
5

8 2 5 10 4

Sample Output 1
2 -1 4 4 -1

Explanation
In the given array, next smaller element to 8 is 2 and for 5 & 10 it is 4. For 2 and 4 the next smaller element does not exist so the final ans is [2, -1, 4, 4, -1].

Constraints
1 <= N <= 10^5

0 <= A[i] <= 10^9
 */
public class NextSmallerElement {
	
	static int [] nextSmallerElement(int arr[], int n){
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> result = new ArrayList<>();

		for(int i = arr.length - 1; i >= 0; i--) {
			while(!stack.empty() && arr[i]<=stack.peek()) {
				stack.pop();
			}
			result.add(stack.empty() ? -1 : stack.peek());
			stack.push(arr[i]);
		}

		int[] resultArray = new int[result.size()];
		int j = result.size()-1;
		for (int i = 0; i < result.size(); i++) {
			resultArray[j--] = result.get(i);
		}
		return resultArray;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int [] ans = nextSmallerElement(arr, n);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
	}

}
