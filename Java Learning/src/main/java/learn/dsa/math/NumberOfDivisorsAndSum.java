package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find factors of given number and their sum
 * 
 * Given an integer N, find the number of distinct factors and the sum of these factors.
 */
public class NumberOfDivisorsAndSum {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans[] = numberOfDivisorsAndSum(n);
		System.out.println(ans[0] + " " + ans[1]);
	}

	static int[] numberOfDivisorsAndSum(int n){
		int count = 0;
		int sum = 0;
		for(int i = 1; i<=n;i++) {
			if(n%i == 0) {
				count++;
				sum+=i;
			}
		}
		int[] result = new int[2];
		result[0] = count;
		result[1] = sum;
		return result;
	}
}
