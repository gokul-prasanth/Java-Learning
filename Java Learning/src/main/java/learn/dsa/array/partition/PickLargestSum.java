package learn.dsa.array.partition;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn July 28, 2021
 * 
 * Pick the largest sum from either side
 * 
 * You are given an Array A of size N. You have to pick total B elements from either left or right end of the array A to get the maximum sum.
 * 
 */
class PickLargestSum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		List<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		long result = pickLargestSum(N, B, A);
		System.out.println(result);
		sc.close();
	}

	static long pickLargestSum(int length, int window, List<Integer> arryList) {

		// Initialse variables
		int curr_points = 0;
		int max_points = 0;

		// Iterate over first K elements
		// of array and update the value
		// for curr_points
		for(int i = 0; i < window; i++) {
			curr_points += arryList.get(i);
		}

		// Update value for max_points
		max_points = curr_points;

		// j points to the end of the array
		int j = length - 1;

		for(int i = window - 1; i >= 0; i--) {
			curr_points = curr_points +
					arryList.get(j) - arryList.get(i);
			
			max_points = Math.max(curr_points,
					max_points);
			j--;
		}

		// Return the final result
		return max_points;
	}
}
