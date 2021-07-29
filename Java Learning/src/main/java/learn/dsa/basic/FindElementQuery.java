package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given a sorted array containing n elements and q queries. 
 * Each query is an integer x. Find the index at which x is present in the array. 
 * If there are multiple occurrences then find the leftmost one. If x is not present, return -1.Note : No inbuilt functions such as ( upperbound , lowerbound , etc. ) to be used. 
 */
public class FindElementQuery {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int q = sc.nextInt();

		while (q-- > 0) {

			int x = sc.nextInt();
			int result = findElementQuery(n, arr, x);

			System.out.println(result);

		}

	}

	static int findElementQuery(int n, int[] arr, int x) {
		int result = -1;
		for(int i = 0; i< n ; i++) {
			if(arr[i] == x) {
				result  = i;
				break;
			}
		}
		return result;
	}
}

