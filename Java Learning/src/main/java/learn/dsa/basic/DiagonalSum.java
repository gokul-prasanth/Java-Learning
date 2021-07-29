package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given a matrix of dimensions n x n, find the sum of elements along the principal diagonal of the matrix.
 * Principal diagonal is the diagonal that starts at top left(0,0),(1,1) and goes to the bottom right (n-1,n-1). 
 */
public class DiagonalSum {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		}

		int result = diagonalSum(n, a);
		System.out.println(result);
	}

	static int diagonalSum(int n, int[][] a) {

		int result = 0;
		for(int i = 0; i< n; i++) {
			result += a[i][i];
		}

		return result;
	}
}
