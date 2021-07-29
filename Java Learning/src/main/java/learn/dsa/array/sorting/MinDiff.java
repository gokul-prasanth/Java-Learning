package learn.dsa.array.sorting;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn July 29. 2021
 * 
 * Implement Count sort on given string
 * 
 * A string S is given consisting of lowercase alphabetical characters only. 
 * You need to return a sorted string using Count Sort.
 * 
 */
class MinDiff {
	
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = minDiff(n, a);

        System.out.println(res);

    }

    static int minDiff(int n, int a[]) {
    	
    	Arrays.sort(a);
    	
    	int min = 999999999;
    	for(int i = 0; i<n-1; i++) {
    		if(a[i]-a[i+1] < min) {
    			min = a[i]-a[i+1];
    		}
    	}
    	
    	return min;
    }
}
