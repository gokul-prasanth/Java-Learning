package learn.dsa.array.bitManipulation;

import java.util.Scanner;

public class ReverseBits {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		sc.close();
		while(t-- > 0){
			long n = sc.nextLong();
			long ans = reverseBits(n);
			System.out.println(ans);
		}
		sc.close();
	}

	static long reverseBitsOptimal(long n){
		long num = n;
		long rev = 0;
		int counter = 0;
		// traversing bits of 'n'
		// from the right
		while (num > 0)
		{
			// bitwise left shift
			// 'rev' by 1
			rev <<= 1;

			// if current bit is '1'
			if ((num & 1) == 1) {
				rev ^= 1;
			}

			// bitwise right shift
			//'n' by 1
			num >>= 1;
			counter++;
		}
		
		while(counter < 32) {
			rev <<= 1;
			counter++;
		}

		// required number
		return rev;
	}

	static long reverseBits(long n){
		char[] reversebinary = decimalToReverseBinaryConverter(n);
		long binary = biaryToDecimalConvertor(reversebinary);
		return binary;
	}

	private static char[] decimalToReverseBinaryConverter(long decimal) {
		StringBuilder binary = new StringBuilder();
		long temp = decimal;
		int rem = 0;
		while(temp != 0 ) {
			rem = (int) temp % 2;
			temp/=2;
			binary.append(rem);
		}
		while(binary.length() < 32) {
			binary.append(0);
		}
		return binary.toString().toCharArray();
	}
	
	private static long biaryToDecimalConvertor(char[] binary) {
		long decimal = 0;
		int counter = 0;
		for(int i=binary.length-1; i>=0; i--) {
			int power = (int) Math.pow(2, counter++);
			int digit = binary[i] - '0';
			decimal += digit * power;
		}
		return decimal;
	}
}

//00111001011110000010100101000000