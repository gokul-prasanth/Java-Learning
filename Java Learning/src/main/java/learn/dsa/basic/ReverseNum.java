package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given a number, return the reverse of that number.
 */
class ReverseNum {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int reverse = reverseNum(num);

		System.out.println(reverse);

	}

	static int reverseNum(int num) {
		if(num == 0) {
			return num;
		}

		int reverse = 0;
		int temp = num;

		while(temp != 0) {
			int rem = temp%10;
			reverse = rem + (reverse*10);
			temp = temp/10;
		}

		return reverse;
	}
}
