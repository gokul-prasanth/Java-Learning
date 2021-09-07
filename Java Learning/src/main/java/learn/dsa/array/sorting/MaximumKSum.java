package learn.dsa.array.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 30, 2021
 * 
 * Given an array(need not be sorted), find the maximum possible sum using any k elements of the array.
 * 
 * Sample Input 1
 * 4 2
 * 4 2 4 1
 * 2
 * 3
 * Sample Output 1
 * 8
 * 10
 * Explanation 1
 * For first query 4 + 4 = 8
 * Similarly for second query top 3 elements will be 4,4 and 2 which sums to 10
 */
public class MaximumKSum {

	static ArrayList<Long> maximumKSum(int n, int q, int arr[], int queries[]) {
		ArrayList<Long>  result = new ArrayList<>();
		Arrays.sort(arr);
		for(int i = 0; i<q; i++) {
			int len = n-1;
			int query = queries[i];
			if(query <= n) {
				double sum = 0d;
				while(query > 0) {
					sum += arr[len--];
					query--;
				}
				result.add((long)sum);
			}
		}

		return result;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int queries[] = new int[q];

		for (int i = 0; i < q; i++) {
			queries[i] = sc.nextInt();

		}

		ArrayList<Long> res = maximumKSum(n, q, arr, queries);

		for (long j : res) {
			System.out.println(j);
		}
		
		sc.close();

	}

}
