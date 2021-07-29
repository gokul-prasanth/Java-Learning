package learn.dsa.array.sorting;

import java.util.*;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 *  Implement Count sort on given string
 *  
 *  A string S is given consisting of lowercase alphabetical characters only. 
 *  You need to return a sorted string using Count Sort.
 *  
 */
class CountSort {
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String res = countSort(n, s);

        System.out.println(res);

    }

    static String countSort(int n, String s) {
    	
    	return s;
    }
}
