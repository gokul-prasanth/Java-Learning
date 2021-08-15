package learn.dsa.basic;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 06, 2021
 * 
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 * 
 * Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {

	private static void duplicateZeros(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				shiftRight(arr, i);
				arr[i++] = 0;
			}
		}
	}

	private static void shiftRight(int[] arr, int index) {
		for(int i = arr.length-1; i > index; i--) {
			arr[i] = arr[i-1];
		}
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i = 0 ; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		duplicateZeros(nums);
		for(int i = 0 ; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
