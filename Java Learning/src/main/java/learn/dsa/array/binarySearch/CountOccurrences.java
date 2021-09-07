package learn.dsa.array.binarySearch;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn 
 * 
 * Count occurrences of an integer
 * 
 * Problem Description
Given a sorted integer array of length n with possible duplicate elements. Find the number of occurrences of an integer k using binary search.

Input format
There are 2 lines of input.

First line contains 2 space separated integers n, k - Number of elements, the integer k.

Second line contains n space separated integers - The integer array.

Output format
Print the number of occurrences of the integer k.

Sample Input 1
5 2

-1 2 2 4 7

Sample Output 1
2

Explanation 1
The integer 2 occurs 2 times in the given array.

Constraints
1 <= n <= 10^6

-10^9 <= k <= 10^9

-10^9 <= A[i] <= 10^9

 */
class CountOccurrences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int res = countOccurrences(n, k, a);

        System.out.println(res);
        sc.close();
    }

    static int countOccurrences(int n, int k, int a[]) {
    
		// index of first occurrence of x in arr[0..n-1]   
		int i;

		// index of last occurrence of x in arr[0..n-1]
		int j;

		/* get the index of first occurrence of x */
		i = first(a, 0, n-1, k, n);

		/* If x doesn't exist in arr[] then return -1 */
		if(i == -1) {
			return 0;
		}

		/* Else get the index of last occurrence of x.
      Note that we are only looking in the
      subarray after first occurrence */ 
		j = last(a, i, n-1, k, n);    

		/* return count */
		return j-i+1;
	}

	/* if x is present in arr[] then returns the
    index of FIRST occurrence of x in arr[0..n-1],
    otherwise returns -1 */
	static int first(int arr[], int low, int high, int x, int n)
	{
		if(high >= low)
		{
			/*low + (high - low)/2;*/ 
			int mid = (low + high )/2; 
			if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
				return mid;
			else if(x > arr[mid])
				return first(arr, (mid + 1), high, x, n);
			else
				return first(arr, low, (mid -1), x, n);
		}
		return -1;
	}

	/* if x is present in arr[] then returns the
    index of LAST occurrence of x in arr[0..n-1],
    otherwise returns -1 */
	static int last(int arr[], int low, int high, int x, int n)
	{
		if(high >= low)
		{
			/*low + (high - low)/2;*/     
			int mid = (low + high)/2;
			if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
				return mid;
			else if(x < arr[mid])
				return last(arr, low, (mid -1), x, n);
			else
				return last(arr, (mid + 1), high, x, n);     
		}
		return -1;
	}
}