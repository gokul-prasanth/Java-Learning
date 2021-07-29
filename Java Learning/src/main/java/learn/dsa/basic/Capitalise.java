package learn.dsa.basic;

import java.util.Scanner;

/**
 * 
 * Given a paragraph of words, capitalise the first character of each word and return the updated paragraph.
 * Note : No inbuilt function such as split() to be used.
 */
class Capitalise {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String captStr = capitalise(str);
		System.out.println(captStr);
	}

	static String capitalise(String str) {
		String[] splited =  str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String stringg : splited) {
			String firstLetStr = stringg.substring(0, 1);
			String remLetStr = stringg.substring(1);
			firstLetStr = firstLetStr.toUpperCase();
			sb.append(firstLetStr + remLetStr+ " ");
		}
		return sb.toString();
	}
}
