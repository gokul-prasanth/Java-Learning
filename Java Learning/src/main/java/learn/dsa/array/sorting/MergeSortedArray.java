package learn.dsa.array.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 06, 2021
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * 
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * 
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class MergeSortedArray {

	/*
	 * Example 1:
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	 * Output: [1,2,2,3,5,6]
	 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	 *
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n > 0) {
			for(int j=0, i=0; j<m+n; j++) {
				if(i<n && (nums1[j]>nums2[i])) {
					insertAndShiftRight(nums1, j, nums2[i]);
					i++;
				} 
			}
		}
	}

	private static void insertAndShiftRight(int[] arr, int index, int element) {
		for(int i = arr.length-1; i > index; i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = element;
	}

	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		if(n > 0) {
			int[] res = new int[m+n];
			int count = 0;
			for(int i = 0, j = 0; i<m; i++) {
				if(j<n) {
					if(nums1[i] < nums2[j]) {
						res[count++] = nums1[i];
						res[count++] = nums2[j];
					} else {
						res[count++] = nums2[j];
						res[count++] = nums1[i];
					}
					j++;
				}
			}

			nums1 = res;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int nums1[] = new int[m+n];
		Arrays.fill(nums1, 0);
		for(int i = 0 ; i < m; i++) {
			nums1[i] = sc.nextInt();
		}

		int nums2[] = new int[n];
		for(int i = 0 ; i < n; i++) {
			nums2[i] = sc.nextInt();
		}

		merge2(nums1, m, nums2, n);

		for(int i = 0 ; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
		
		sc.close();
	}
}
