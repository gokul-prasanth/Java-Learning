package learn.dsa.array.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 28, 2021
 * 
 * Rearrange to form largest number
 * Given an array of non negative integers, arrange the elements, such that if made into a number, they form the largest number.
 * 
For instance,

Given the array [1, 3, 10] , this should be arranged to [3, 1, 10] - since the largest possible number formed by these numbers is 3110.

 */
class LargestNumber {

	public String largestNumber(int[] nums) {

		if(nums.length == 0) {
			return null;
		}
		if(nums.length == 1) {
			return Integer.toString(nums[0]);
		}

		List<String> numsString = new ArrayList<>();

		for(int i = 0; i<nums.length; i++) {
			numsString.add(Integer.toString(nums[i]));
		}
		Collections.sort(numsString, new Comparator<String>() {
			@Override 
			public int compare(String a, String b)
			{
				String ab = a + b;
				String ba = b + a;

				return ab.compareTo(ba) > 0 ? -1 : 1;
			}
		});

		Iterator<String> it = numsString.iterator();
		StringBuilder largest = new StringBuilder();
        while (it.hasNext()) {
        	largest.append(it.next());
        }
        
		return largest.toString();
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		String result = new LargestNumber().largestNumber(nums);

		System.out.println(result);
		
		scanner.close();
	}

}
