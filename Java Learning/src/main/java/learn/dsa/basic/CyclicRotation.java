package learn.dsa.basic;

import java.util.Scanner;

/**
 * @author Gokul A
 * 
 * Given an array of n integers and an integer k, 
 * rotate the array k times in clockwise order.
 */
class CyclicRotation {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		int rotatedArr[] = cyclicRotation(n, arr, k);

		for (int j : rotatedArr)
			System.out.print(j + " ");

	}

	static int[] cyclicRotation(int n, int[] arr, int k) {
		while(k-- != 0) {
			rotateOne(n, arr);
		}
		return arr;
	}

	private static int[] rotateOne(int n, int[] arr) {
		int temp = arr[n-1];
		for(int i = n-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		return arr;

	}
}
