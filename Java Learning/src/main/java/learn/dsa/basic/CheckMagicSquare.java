package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given a matrix of dimensions n x n having elements 1 to n*n distinct elements, 
 * check whether the matrix is magic square or not.
 * Magic square is a square that has the same sum along all rows, columns and diagonals.
 */
public class CheckMagicSquare {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int grid[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				grid[i][j] = sc.nextInt();
		}

		String result = checkMagicSquare(n, grid);

		System.out.println(result);

	}

	static String checkMagicSquare(int n, int[][] grid) {

		int[] sumArray = new int[n];

		for(int i = 0; i< n; i++) 
		{
			int result = 0;
			for(int j = 0; j< n; j++) {
				result += grid[i][j];
			}
			sumArray[i] = result;
		}

		String output = "Yes";
		for(int i = 0; i< n; i++) 
		{
			if(i+1<n && sumArray[i] != sumArray[i+1]) {
				output = "No";
				break;
			}
		}

		return output;
	}
}
