package learn.dsa.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Print odd numbers upto n
 * 
 * Given a number N, you have to print all the odd numbers upto N in increasing order.
 */
public class OddNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> result = oddNumbers(n);

		for (int j : result)
			System.out.print(j + " ");

	}

	static ArrayList<Integer> oddNumbers(int n) {
		ArrayList<Integer> res = new ArrayList<>();
		for(int  i = 1; i<=n; i++) {
			if(i%2 != 0) {
				res.add(i);
			}
		}
		return res;
	}
}
