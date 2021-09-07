package learn.dsa.array.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 28, 2021
 * 
 * Given an unsorted array, sort it in wave form. That is, reorder it such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * Sort in wave fashion
 * 
 */
class WiggleSort {


	static List<Integer> wiggleSort(int n, List<Integer> nums){

		for(int i = 1; i<n; i+=2) {
			if(nums.get(i-1) > nums.get(i)) {
				swap(nums, i-1, i);
			}
			if(i+1 < n && nums.get(i) < nums.get(i+1)) {
				swap(nums, i, i+1);
			}
		}

		return nums;
	}

	private static void swap(List<Integer> nums, int a, int b)
	{
		int temp = nums.get(a);
		nums.set(a, nums.get(b));
		nums.set(b, temp);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer>nums = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			nums.add(sc.nextInt());
		}
		List<Integer>ans = wiggleSort(n,nums);
		for (int i = 0; i < n; i++) {
			System.out.print(ans.get(i)+" ");
		}
		sc.close();
	}

}

