package learn.dsa.array.partition;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn July 28, 2021
 * 
 * Find the equal partition index
 * 
 * Partitioning an array means to split an array along an element, such that it divides the array into two parts with some specific property. The element that partitions the array is called the partitioning element.
 * Given an array, find the element, partitioning along which, the sum of elements to its left, equals the sum of elements to its right. The partition element itself is to be excluded from both sums.
 * Return the index of the partitioning element. If no such element exists, return -1.
 */
public class EqualPartition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextLong();
		
		int res = equalPartition(n, arr);

		System.out.println(res);

	}

	static int equalPartition(int n, long arr[]) {

		long prefixSum[] = new long[n];
		long suffixSum[] = new long[n];

		long sum = 0;
		for(int i = 0; i<n; i++) {
			sum += arr[i];
			prefixSum[i] = sum;
		}

		sum = 0;
		for(int i = n-1; i>=0; i--) {
			sum += arr[i];
			suffixSum[i] = sum;
		}

		 for (int i = 1; i < n - 1; i++) {
	            if (prefixSum[i] == suffixSum[i]) {
	                return i;
	            }
		 }

		return -1;

	}
}
