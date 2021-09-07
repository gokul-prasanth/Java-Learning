package learn.dsa.array.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 28, 2021
 * 
 * Sort array with string elements
 * Given an array, where integers are written as strings, sort the array and return it, with the elements still being strings.
 * Note that the number of digits in each element may go up to 10^6.
 */
class NumSort {

	static String[] numSort(int n, String[] arr) {

		 Arrays.sort(arr, (left, right) ->
	        {
	            /* If length of left != right, then return
	               the diff of the length else  use compareTo
	               function to compare values.*/
	            if (left.length() != right.length()) {
	                return left.length() - right.length(); 
	            }
	             return left.compareTo(right);
	        });
		 
		return arr;
	}

	public static void main(String args[]) {

		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String arr[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		String sortedArray[] = numSort(n, arr);

		for (String num : sortedArray) {
			System.out.print(num + " ");
		}
		
		sc.close();

	}

}
