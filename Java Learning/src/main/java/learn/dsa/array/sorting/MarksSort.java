package learn.dsa.array.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn Aug 3, 2021
 * 
 * Sorting structures
 * 
 * You are given a list of marks over 5 subjects scored by n students. You need to sort the student by following rules.
The student whose sum of marks will be highest must come at the top of the leaderboard.
Students whose total sum of marks are the same will be sorted alphabetically ascending by name.
In all other cases, student with lesser id will come before in the leaderboard

Sample Input 1
3
1 Alan 45 56 21 32 74
2 Fabien 95 94 93 92 91
3 Gamora 85 65 54 65 76

Sample Output 1
2 3 1
 */
class Student {
	int id;
	String name;
	int marks[] = new int[5];

	public Student(int id, String name, int marks[]) {
		this.id = id;
		this.name = name;

		for (int i = 0; i < 5; i++) {
			this.marks[i] = marks[i];
		}
	}
}

public class MarksSort {

	static int[] marksSort(int n, Student arr[]) {
		Arrays.sort(arr, new Comparator<Student>() {
			@Override
			public int compare(Student arg0, Student arg1) {
				int sum1 = arg0.marks[0] + arg0.marks[1] + arg0.marks[2] + arg0.marks[3] + arg0.marks[4];
				int sum2 = arg1.marks[0] + arg1.marks[1] + arg1.marks[2] + arg1.marks[3] + arg1.marks[4];
				if(sum1 > sum2) {
					return -1;
				} else if(sum1 < sum2) {
					return 1;
				} else if(sum1 == sum2) {
					String name1 = arg0.name;
					String name2 = arg1.name;
					int comparision = name1.compareTo(name2);
					if(comparision > 0) {
						return 1;
					} else if (comparision < 0) {
						return -1;
					} else if (comparision == 0) {
						int id1 = arg0.id;
						int id2 = arg1.id;
						if(id1 > id2) { 
							return 1;  
						}
						else if(id1 < id2)  {
							return -1;
						}
					}
				}
				return 0;
			}

		});

		int[] array = new int[arr.length];

		for(int i = 0; i<n; i++) {
			array[i] = arr[i].id;
		}

		return array;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Student arr[] = new Student[n];

		for (int i = 0; i < n; i++) {

			int id = sc.nextInt();
			String name = sc.next();
			int marks[] = new int[5];

			for (int j = 0; j < 5; j++)
				marks[j] = sc.nextInt();
			arr[i] = new Student(id, name, marks);
		}

		int res[] = marksSort(n, arr);

		for (int j : res) {
			System.out.print(j + " ");
		}
	}

}