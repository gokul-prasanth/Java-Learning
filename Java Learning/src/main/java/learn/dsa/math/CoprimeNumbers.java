package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find numbers coprime to given number
 * 
 * Given a number n, you have to find the count of the numbers from 1 to n that are coprime to n.
 */
public class CoprimeNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = coprimeNumbers(n);

		System.out.println(result);

	}

	static int coprimeNumbers(int n) {
		int count  = 0;
		for(int i = 1; i<=n; i++) {
			if(findGCD(i, n) == 1) {
				//System.out.println(i);
				count++;
			}
		}
		return count;

	}

	static int findGCD(int x, int y)  
	{  
		int r=0, a, b;  
		a = (x > y) ? x : y; // a is greater number  
		b = (x < y) ? x : y; // b is smaller number  
		r = b;  
		while(a % b != 0)  
		{  
			r = a % b;  
			a = b;  
			b = r;  
		}  
		return r;  
	}
}
