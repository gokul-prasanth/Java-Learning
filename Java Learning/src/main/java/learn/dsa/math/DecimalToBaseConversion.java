package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Convert number from decimal to given base
 * Given two numbers n in decimal and b you have to calculate the value of that number in base b.
 */
public class DecimalToBaseConversion {

	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int b = sc.nextInt();

	        String result = decimalToBaseConversion(n, b);
	        System.out.println(result);

	    }

	    static String decimalToBaseConversion(int n, int b) {
	        String rem = "";
			while(n > 0) {
				rem += reVal(n%b);
				n /= b;
			}
			StringBuilder sb = new StringBuilder(rem);
			return sb.reverse().toString();

	        
	    }

	    static char reVal(int num)
	{
	    if (num >= 0 && num <= 9)
	        return (char)(num + 48);
	    else
	        return (char)(num - 10 + 65);
	}
	}

}