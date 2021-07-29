package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Add two integers represented as strings
 * 
 * There are two numbers, given as strings. The numbers may be very large (may not fit even in long long int). You need to find the sum of these two numbers.
 * 
 * Note : No inbuilt function such as Big Integer() to be used
 */
public class BigIntegerAddition {
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    static String bigIntegerAddition(String num1, String num2) {

        
		if(num1.length() > num2.length()) {
			String temp =  num1;
			num1 = num2;
			num2 = temp;
		}
		String result = "";
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int carry  = 0;

		for(int i = 0; i< num1.length(); i++) {
			int int1 = (int)num1.charAt(i) - '0';
			int int2 = (int)num2.charAt(i) - '0';
			int sum = int1 + int2 + carry;
			carry = sum / 10;
			result+=(char)(sum % 10 + '0');
		}

		for(int i = num1.length(); i<num2.length(); i++) {
			int sum = (int)num2.charAt(i)- '0' + carry;
			carry = sum / 10;
			result+=(char)(sum % 10 + '0');
		}

		if (carry > 0) {
			result+=(char)(carry + '0');
		}
		
		result = new StringBuilder(result).reverse().toString();

		return result;
    }
}
