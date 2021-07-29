package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find the Nth Fibonacci number
 * 
 * Given an integer n, you have to find the nth fibonacci number. 
 * The fibonacci sequence is given by 0,1,1,2,3,5,8,... where 0 and 1 are the 0th and 1st fibonacci numbers respectively 
 * and every consecutive number is the sum of the previous two numbers in the sequence.
 */
public class NthFibonacciNumber {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = nthFibonacciNumber(n);
		System.out.println(ans);
	}

	static int nthFibonacciNumber( int n){

		if(n == 0) {
			return 0;
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		int n1 = 1;
		int n2 = 1;
		//System.out.println("n1: "+n1+",n2: "+n2 );
		for(int i = 3; i <= n; i++) {
			int temp  = n1+n2;
			n2 = n1;
			n1 = temp;
			//System.out.println("n1: "+n1+",n2: "+n2 );
		}

		return n1;
	}
}