package learn.dsa.array.bitManipulation;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn Sep 07, 2021
 * 
 * Problem Description
Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).

Input format
Single line containing one 32-bit unsigned integer N.

Output format
Single line containing number of 1 bits in N.

Sample Input 1
5

Sample Output 1
2

Explanation 1
Binary representation of 5 is:

101

Hence total number of 1 bits = 2

Constraints
0<=N<=2^32-1

 */
class NumberOfOneBits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = numberOfOneBits(n);
        System.out.print(ans);
    }

    static int numberOfOneBits(long n){
        return Integer.bitCount((int)n);
    }
}
