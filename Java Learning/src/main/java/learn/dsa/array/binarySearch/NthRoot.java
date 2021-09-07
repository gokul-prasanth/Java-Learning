package learn.dsa.array.binarySearch;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn Sep 07, 2021
 * 
 * Problem Description
You are given a X positive integer. You need to find the N-th root of X.

If the N-th root is in decimal you need to print its floor value e.g, floor(3.23) = 3.

Input format
First line contains T i.e, the number of test cases.

Each test case has a single line that contains two positive integers, X and N.

Output format
For each test case print the floor(N-th root of X) in a new line.

Sample Input 1
4

4 2

9 3

11 2

16 4

Sample Output 1
2

2

3

2

Explanation
For X = 4 and N = 2 => (4) ^ (1/2) = 2. And floor(2) = 2

For X = 9 and N = 3 => (9) ^ (1/3) = 2.08. And floor(2.08) = 2

For X = 11 and N = 2 => (11) ^ (1/2) = 3.316. And floor(3.316) = 3

For X = 16 and N = 4 => (16) ^ (1/4) = 2. And floor(2) = 2

Constraints
1 <= T <= 10 ^ 4

1 <= X <= 10 ^ 9

1 <= N <= 10 ^ 4

 */
class NthRoot {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			int ans = nthRoot(x, n);
			System.out.println(ans);
		}
		sc.close();
	}

	static int nthRoot(int x, int n) {
		int l = 1;
        int r = x;
        while(l<=r){
            int mid = (l + r)/2;
            if(Math.pow(mid,n) == x ) return mid;
            else if(Math.pow(mid,n) > x)
                r = mid-1;
            else
                l = mid +1;
        }
        return r;
	}


}
