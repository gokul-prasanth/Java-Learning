package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given an array of n integers, find the maximum element in the given array.
 * Note : Do not use any inbuilt functions that find the maximum element directly.
 */
public class MaxInArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int result = maxInArray(n, arr);
		System.out.println(result);
	}

	static int maxInArray(int n, int[] arr) {
		int result  = 0;
		for(int i = 0; i < n; i ++) {
			if(arr[i] > result) {
				result = arr[i];
			}
		}
		return result;
	}
}

