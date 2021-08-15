package learn.dsa.array.twoPointers;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 09, 2021
 * 
 * Find pair with given sum in unsorted array
 * 
 * Problem Description
 * Given an array of integers as input, output the indices of two numbers in the array which add up to a specified target.
 * Assume that each input would have exactly one solution and you cannot use the same element twice. If 2 different elements have the same value, they can be used.
 * 
 */
public class TwoSumInUnsortedArray {

	public int[] twoSum(int[] arr, int sum) {
		int n = arr.length;
		int[] result = new int[2];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j<n; j++) {
				if(i != j && arr[i] + arr[j] == sum) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[scanner.nextInt()];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = scanner.nextInt();
		int target = scanner.nextInt();
		scanner.close();

		TwoSumInUnsortedArray twoSumInUnsortedArray = new TwoSumInUnsortedArray();
		int[] complements = twoSumInUnsortedArray.twoSum(numbers, target);

		System.out.print(complements[0] + " " + complements[1]);
	}
}