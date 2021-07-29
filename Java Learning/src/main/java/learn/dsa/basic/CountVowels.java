package learn.dsa.basic;

import java.util.Scanner;

/**
 *  Given a string, count the total number of vowels present in that string.
 *  Note: The string contains uppercase and lowercase english alphabets only.
 */
public class CountVowels {
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    static int countVowels(String str) {
		char[] charArray = str.toCharArray();
		int result = 0;
		for(char c: charArray) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				result++;
			}
		}
		return result;
	
    }
}
