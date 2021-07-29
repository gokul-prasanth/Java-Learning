package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Sum of given series - 2
 * 
 * Given first term A and common ratio R(R<1), find the sum of an infinite GP series.
 * Your answer should be accurate upto 5 decimal places.
 */
public class SeriesSumII {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double R = sc.nextDouble();

        double result = seriesSumII(A, R);

        System.out.println(result);
    }

    static double seriesSumII(double A, double R) {
        double sum = 0;
        if(1 > R) {
         sum = A/(1-R); }
    else {
         sum = A/(R-1);
    }
    return sum;
    }
}

