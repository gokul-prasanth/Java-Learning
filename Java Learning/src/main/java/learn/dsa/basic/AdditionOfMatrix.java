package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given two matrices of dimension n x m, 
 * add the two matrices and print the resultant matrix.
 */
public class AdditionOfMatrix {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int gridOne[][] = new int[n][m];
		int gridTwo[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				gridOne[i][j] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				gridTwo[i][j] = sc.nextInt();
		}

		int[][] result = additionOfMatrix(n, m, gridOne, gridTwo);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(result[i][j] + " ");
			System.out.println();
		}
	}

	// TODO: Implement this method
	static int[][] additionOfMatrix(int n, int m, int[][] gridOne, int[][] gridTwo) {
		int[][] result = new int[n][m];

		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j++) {
				result[i][j] = gridOne[i][j] + gridTwo[i][j] ; 
			}
		}
		return result;
	}
}
