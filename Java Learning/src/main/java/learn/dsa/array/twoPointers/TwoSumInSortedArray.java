package learn.dsa.array.twoPointers;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 08, 2021
 * 
 * Find pair with given sum in sorted array
 * 
 * Given a sorted array of integers and a target, find if there’s a pair of elements that add up to the target. Return true if such a pair can be found, and false otherwise.
 * 
 * Sample Input 1
5 --> Number of elements in array

2 4 5 8 9 --> Array elements

7 --> Target sum value

Sample Output 1
Present

Explanation 1
Since 0 and 2 are the indices where the numbers 2 and 5 which add up to 7 are seen
 */
public class TwoSumInSortedArray {
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {
        int right = n-1;
		int left = 0;
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == k) {
				return true;
			} else if(sum < k) {
				left++;
			} else if(sum > k) {
				right--;
			}
		}
		return false;
    }
}
