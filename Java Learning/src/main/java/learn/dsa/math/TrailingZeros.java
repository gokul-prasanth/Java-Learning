package learn.dsa.math;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find trailing zeroes in factorial of a number
 * 
 * Write a program that outputs the number of trailing zeroes in n!(n factorial).
 */
public class TrailingZeros {

	static long calcSpl(long n) {
		long pow = 25;
		long extraFives = 0;

		while(pow<=n) {
			extraFives++;
			pow = pow*5;
		}
		return extraFives;
	}
	static long findTrailingZeros(long n) {
		long trailingZeroes = 0;

		for(long  i = 5; i<=n ; i*=5) {
			trailingZeroes += n/i;
		}
		return trailingZeroes;

	}
}
