package learn.dsa.basic;

import java.util.Scanner;

/**
 * @author Gokul A
 * 
 * Given a number n, you have to print a diamond-shaped pattern with 2n-1 rows using '*', with the i’th row having i asterisks for i <= n and 2n-i asterisks for i > n. (i starts at 1)
 * For eg. if n = 5, the pattern will be:
 * 
 *       *
 *      * *
 *     * * *
 *    * * * * 
 *   * * * * *
 *    * * * *
 *     * * * 
 *      * *
 *       *
 */
public class DiamondPrinting {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] result = diamondPrinting(n);

		for(int i = 0; i <n; i++) {
			System.out.println(result[i]);
		}
		for(int i = n-2; i >=0; i--) {
			System.out.println(result[i]);
		}

	}

	static String[] diamondPrinting(int n) {
		String[] result = new String[n];
		for(int i = 1; i<=n; i++) {
			StringBuilder sb = getPyramidSpaces(n-i);
			StringBuilder stars  = getPyramidStars(i);
			sb.append(stars.toString().substring(0, stars.length()-1));
			result[i-1] = sb.toString();
		}

		return result;
	}

	static StringBuilder getPyramidSpaces(int temp) {
		StringBuilder sb = new StringBuilder();
		while(temp != 0) {
			sb.append(" ");
			temp--;
		}
		return sb;
	}

	static StringBuilder getPyramidStars(int i) {
		StringBuilder sb = new StringBuilder();
		int star = 0;
		while(star != i) {
			sb.append("* ");
			star++;
		}
		return sb;
	}
}

