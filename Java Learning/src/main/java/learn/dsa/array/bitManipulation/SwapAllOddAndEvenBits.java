package learn.dsa.array.bitManipulation;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn August 15, 2021
 * 
 * Swap all the Odd and Even bits of an integer
 * 
 * Given an unsigned integer N, swap all odd bits with even bits. Every even position bit is swapped with the adjacent bit on the right side and every odd position bit is swapped with adjacent on the left side. Assume a 32 bit integer.
 *
 * Sample Input 1
 * 22
 *
 * Sample Output 1
 * 41
 *
 * Explanation 1
 * The given number is 22 (00010110), it should be converted to 41 (00101001).
 */
public class SwapAllOddAndEvenBits {

	public long swapBitsOptimalSolution(long n) {
		// Get all even bits of x
		long even_bits = n & 0xAAAAAAAA;

		// Get all odd bits of x
		long odd_bits = n & 0x55555555;

		// Right shift even bits
		even_bits >>= 1;

		// Left shift even bits
		odd_bits <<= 1;

		// Combine even and odd bits
		return (even_bits | odd_bits);
	}
	// Complete the function below
	public long swapBits(long n) {
		char[] binary = decimalToBinaryConverter(n);
		for(int i=0; i<binary.length-1; i+=2) {
			swap(binary, i, i+1);
		}
		n = biaryToDecimalConvertor(binary);
		return n;
	}

	private long biaryToDecimalConvertor(char[] binary) {
		long decimal = 0;
		int counter = 0;
		for(int i=binary.length-1; i>=0; i--) {
			int power = (int) Math.pow(2, counter++);
			int digit = binary[i] - '0';
			decimal += digit * power;
		}
		return decimal;
	}

	private void swap(char[] binary, int i, int j) {
		char temp = binary[i];
		binary[i] = binary[i+1];
		binary[i+1] = temp;
	}

	private char[] decimalToBinaryConverter(long decimal) {
		StringBuilder binary = new StringBuilder();
		int temp = (int) decimal;
		int rem = 0;
		while(temp != 0 ) {
			rem = temp % 2;
			temp/=2;
			binary.append(rem);
		}
		while(binary.length() < 32) {
			binary.append(0);
		}
		return binary.reverse().toString().toCharArray();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();
		long result = new SwapAllOddAndEvenBits().swapBits(n);
		result = new SwapAllOddAndEvenBits().swapBitsOptimalSolution(n);
		System.out.println(result);
	}
}
