package learn.dsa.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Check if given number is prime
 */
public class CheckPrime {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			nums.add(n);
		}

		ArrayList<Boolean> ans = checkPrime(t, nums);

		for (boolean res : ans) {
			System.out.println(res);
		}

	}

	static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) {
		ArrayList<Boolean> result = new ArrayList<>();
		nums.stream().forEach(each -> result.add(checkPrime(each)));
		return result;
	}

	static boolean checkPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
