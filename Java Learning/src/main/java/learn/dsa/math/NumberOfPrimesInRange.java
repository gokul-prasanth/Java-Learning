package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Number of primes in the given range
 * 
 * Given two whole numbers, find the count of prime numbers in that range, inclusive of the endpoints..
 */
public class NumberOfPrimesInRange {
	
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int l = sc.nextInt();
	        int r = sc.nextInt();
	        int ans = numberOfPrimesInARange(l, r);
	        System.out.println(ans);
	    }

	    static int numberOfPrimesInARange(int l, int r) {
			int count  = 0;
			for(int i = l; i<=r; i++) {
				if(checkPrime(i)) {
					count++;
				}
			}
			return count;
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
