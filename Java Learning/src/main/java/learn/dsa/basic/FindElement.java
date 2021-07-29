package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given an array of n elements and an integer x,find the index where x is present in the array. 
 * If there are multiple occurrences, find the leftmost one. If x is not present, return -1.
 */
public class FindElement {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int x = sc.nextInt();

		int result = findElement(n, arr, x);

		System.out.println(result);

	}

	static int findElement(int n, int[] arr, int x) {
		int result = -1;
		for(int i =0; i<n;i++) {

			if(arr[i] == x) {
				result = i;
				break;
			}

		}
		return result;
	}
}
