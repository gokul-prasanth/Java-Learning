package learn.dsa.array.binarySearch;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 04, 2021
 * 
 * Search in Sorted Rotated Array 
 * 
 * An array sorted in ascending order is rotated about a pivot unknown to you. 
 * Such an array is referred to as a rotated sorted array or a sorted-pivoted array. 
 * 
 * For example : [1,2,3,4,5] is a sorted array while [3,4,5,1,2] is a rotated sorted array.
 * You are given a rotated sorted array, and some integer values. You have to find each value’s location in the array. 
 * If the value is present, return the index in which it is stored ( 0 based indexing) , otherwise if not found return -1.
 * Assume the array doesn’t have duplicates.
 */
public class SearchInRotatedSortedArray {

	// Complete the function implementation below
	public int search(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		while(start <= end) {
			int mid = start+(end-start)/2;

			if(nums[mid] == target) {
				return mid;
			}

			if(nums[start] <= nums[mid]) { //left half sorted
				if(nums[start] <= target  && target < nums[mid]) { //search left half
					end = mid - 1;
				} else { //search right half
					start = mid + 1;
				}
			} else { //Right half sorted
				if(nums[mid] < target  && target <= nums[end]) { //search right half
					start = mid + 1;
				} else { //search left half
					end = mid - 1;
				}
			}
		}


		return -1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nums[] = new int[n];
		for(int i = 0 ; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		int q = scanner.nextInt();
		while(q > 0) {
			int target = scanner.nextInt();
			int result = new SearchInRotatedSortedArray().search(nums , target);
			System.out.println(result);
			q--;
		}
		scanner.close();
	}
}
