package learn.dsa.array.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn  July 28, 2021
 * 
 * Sort based on absolute values
 * Given an array of integers, sort the array based on the absolute value of the element
 * 
 */
class SortArrayAbsolute {

	static int[] sortArrayAbsolute(int n, int arr[]) {

		List<Integer> arrList = new ArrayList<Integer>();

		for(int i = 0; i<arr.length; i++) {
			arrList.add(arr[i]);
		}

		Collections.sort(arrList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Math.abs(o1) > Math.abs(o2) ?  1: -1;
			}

		});
		
		int i = 0;
		Iterator<Integer> it = arrList.iterator();
		while (it.hasNext()) {
			arr[i++] = it.next();
		}

		return arr;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res[] = sortArrayAbsolute(n, arr);

		for (int j : res)
			System.out.print(j + " ");
		
		sc.close();
	}

}
