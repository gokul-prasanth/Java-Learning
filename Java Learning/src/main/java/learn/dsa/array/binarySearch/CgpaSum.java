package learn.dsa.array.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Find the CGPA
 * Problem Description
Given the credit points for 5 subjects and the grade points scored by the students in each subject, you need to find out how many pairs of students have their sum of CGPA as 10.
Students are represented with their roll numbers and the CGPA is taken as the floor value after calculating it from the formula given.
Formula for calculating CGPA = sum_of(grade points scored in ith subject * ith subject credit points) / sum_of(ith subject credit points).
Input format
First line contains an integer N - Number of students.
Second line contains 5 space separated integers - Each subject's credit points.
Next N lines, each containing 6 space separated integers - roll no of the student, grade points scored in 5 subjects by that student.
Output format
Print the count of student pairs whose CGPA sum is equal to 10.
Sample Input 1
3
2 3 3 4 4
1 9 8 6 5 7
2 5 3 6 7 8
3 7 6 2 3 5
3 <-- number of students
2 3 3 4 4 <-- subject's credit points
1 9 8 6 5 7 <-- 1st student's grade points
2 5 3 6 7 8 <-- 2nd student's grade points
3 7 6 2 3 5 <-- 3rd student's grade points
Sample Output 1
2
Explanation
CGPA of roll no. 1 is (92 + 83 + 63 + 54 + 7*4) / (2+3+3+4+4) = 108/16 = 6 (floor value).
CGPA of roll no. 2 is (52 + 33 + 63 + 74 + 8*4) / (2+3+3+4+4) = 97/16 = 6 (floor value).
CGPA of roll no. 3 is (72 + 63 + 23 + 34 + 5*4) / (2+3+3+4+4) = 70/16 = 4 (floor value).
There are 2 pairs of students whose sum of CGPA is equal to 10 i.e. (1 & 3) and (2 & 3).
Constraints
1 <= N <= 10^5
1 <= subject credit points <= 5
1 <= roll no <= N
0 <= grade points scored <= 10
Hints
You might need to make use of prefix sum to store the total points of the student while calculating the CGPA.
Notice the return type of the function that you’re given - and ensure you declare variables for holding the sum accordingly.
 * */

class CgpaSum {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> subjects = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			subjects.add(sc.nextInt());
		ArrayList<ArrayList<Integer>> students = new ArrayList<ArrayList<Integer>>(n);
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> data = new ArrayList<>();
			for (int j = 0; j < 6; j++) {
				int x = sc.nextInt();
				data.add(x);
			}
			students.add(data);
		}
		long result = cgpaSum(n, subjects, students);
		System.out.println(result);
		sc.close();
	}

	static long cgpaSum(int n, ArrayList<Integer> subjects,
			ArrayList<ArrayList<Integer>> students) {

		ArrayList<Long> cgpaList = new ArrayList<>();
		Integer sub1 = subjects.get(0);
		Integer sub2 = subjects.get(1);
		Integer sub3 = subjects.get(2);
		Integer sub4 = subjects.get(3);
		Integer sub5 = subjects.get(4);

		int credits = sub1+sub2+sub3+sub4+sub5;
		for(int i=0;i<n;i++) {
			ArrayList<Integer> student = students.get(i);
			int score = student.get(1)*sub1
					+student.get(2)*sub2
					+student.get(3)*sub3
					+student.get(4)*sub4
					+student.get(5)*sub5;
			long cgpa = score/credits;
			cgpaList.add(cgpa);
		}

		return countTen(cgpaList, cgpaList.size());
	}

	static long countTen(ArrayList<Long> arr, int n) {
		// To store the count of pairs
		long count = 0;

		// Sort the given array
		Collections.sort(arr);

		// Take two pointers
		int i = 0, j = n - 1;

		while (i < j)
		{
			// If sum is greater
			if (arr.get(i) + arr.get(j) < 10) {
				i++;
			}
			// If sum is lesser
			else if (arr.get(i) + arr.get(j) > 10) {
				j--;
			}
			// If sum is equal
			else {
				// Find the frequency of arr.get(i)
				long x = arr.get(i);
				long xx = i;
				while ((i < j ) && (arr.get(i) == x)) {
					i++;
				}

				// Find the frequency of arr.get(j)
				long y = arr.get(j), yy = j;
				while ((j >= i )&& (arr.get(j) == y)) {
					j--;
				}

				// If arr.get(i) and arr.get(j) are same
				// then remove the extra number counted
				if (x == y) {
					long temp = i - xx + yy - j - 1;
					count += (temp * (temp + 1)) / 2;
				}
				else {
					count += (i - xx) * (yy - j);
				}
			}
		}

		// Return the required answer
		return count;
	}



}