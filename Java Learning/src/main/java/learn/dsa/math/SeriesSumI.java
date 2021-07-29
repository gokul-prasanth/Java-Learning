package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Sum of given series - 1
 * 
 * Find the sum of the series 1 x 3 + 3 x 5 + 5 x 7 + ... upto n terms.
 */
public class SeriesSumI {
	
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int result = seriesSumI(n);

	        System.out.println(result);

	    }

	    static int seriesSumI(int n) {
	        int sum = 0;
			for(int i = 1; i <= n; i++) {
				int odd = getOddNum(i);
				int prod = odd * (odd + 2);
				sum+= prod;
			}
			return sum;
	    }

	    static int getOddNum(int n) {
			if(n == 1) {
				return 1;
			}

			int count = 1;
			int i = 0;
			for(i = 2; count!=n; i++) {
				if(i%2 != 0) {
					count++;
				}
			}

			return i-1;
		}
	}


}
