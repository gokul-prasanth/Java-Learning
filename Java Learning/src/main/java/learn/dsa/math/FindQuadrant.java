package learn.dsa.math;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn July 29, 2021
 * 
 * Find the quadrant
 * 
 * Given coordinates of a point (x,y) in 2D plane, find in which quadrant does this point lie.
 * 
 */
public class FindQuadrant {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();

		int result = findQuadrant(x, y);
		System.out.println(result);

	}

	static int findQuadrant(float x, float y) {

		int quadrant  = 0;
		if(x > 0 && y > 0) {
			quadrant = 1;
		} else if(x < 0 && y < 0) {
			quadrant = 3;
		}
		else if(x <= 0 && y > 0) {
			quadrant = 2;
		}
		else if(x > 0 && y <= 0) {
			quadrant = 4;
		}
		return quadrant;
	}
}
