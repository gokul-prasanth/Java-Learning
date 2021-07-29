package learn.dsa.basic;

import java.util.Scanner;

/**
 * Given the heights of n students of a class, find the average height. 
 * Your answer should be accurate upto 5 decimal places.
 */
class AverageHeight {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a[] = new float[n];

		for(int i = 0; i < n; i++)
		{
			a[i] = Float.parseFloat(sc.next());
		}

		float avgHeight = averageHeight(n, a);
		System.out.println(avgHeight);
	}

	static float averageHeight(int n, float[] a){
		float res = 0;
		for(float num: a) {
			res+=num;
		}
		return res/n;
	}
}
