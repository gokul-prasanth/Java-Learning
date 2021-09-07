package learn.dsa.array.bitManipulation;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn Sep 07, 2021
 * 
 * Find the number of bits to be flipped
 * 
 * Problem Description
Given two numbers, write a program to count the number of bits that need to be flipped to convert the first number to the second number.

Input format
A single line that contains two space separated integers A and B.

Output format
A single line that contains an integer which represents the number of bits needed to flip to convert integer A to integer B

Constraints
0 <= A, B <= 10^18

Sample Input 1
29 15

Sample Output 1
2

Explanation 1
Binary of 29 is 11101 and Binary of 15 is 01111. So, 2 bits need to be flipped.

Sample Input 2
7 10

Sample Output 2
3

Explanation 2
Binary of 7 is 00000111 and Binary of 10 is 00001010. So, 3 bits need to be flipped.
 * 
 */
class Conversion {
	
	public static int conversion(long a,long b)
	{
		 return countSetBits(a^b);
	}

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		System.out.println(conversion(a,b));
		sc.close();
	}	

	// Function that count set bits
    public static int countSetBits(long n)
    {
        int count = 0; 
        while (n != 0) { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
    }
}
