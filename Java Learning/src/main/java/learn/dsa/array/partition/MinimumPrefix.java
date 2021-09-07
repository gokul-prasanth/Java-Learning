package learn.dsa.array.partition;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn July 28, 2021
 * 
 * Find minimum prefix
 * 
 * Given an array nums, return the minimum positive value we can append to the beginning of nums 
 * such that the prefix sum array of the resulting array contains numbers that are all greater than or equal to 0.
 * 
 */
class MinimumPrefix {
	/*

	 Create an array to hold the prefix sums, prefixSum[] and a variable, minSum to keep track of the most negative prefix sum.

     We traverse through the original array. In each iteration, we update prefixSum[i]. We compare prefixSum[i] with minSum. If prefixSum[i] is smaller, we update minSum.

     abs(minSum) will be our answer.

	 */
	
	static long minimumPrefix(int n, int arr[]) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		int[] prefixSum = new int[n];
		int minSum = 0;
		int sum = 0;
		
		for(int i = 0; i<n; i++) {
			sum += arr[i];
			prefixSum[i] = sum;
			
			if(sum < minSum) {
				minSum = sum;
			}
		}

		return Math.abs(minSum);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		long res = minimumPrefix(n, arr);

		System.out.println(res);
		sc.close();

	}

}
