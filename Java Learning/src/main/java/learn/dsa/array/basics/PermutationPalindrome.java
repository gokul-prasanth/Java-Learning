package learn.dsa.array.basics;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn  August 07, 2021
 * 
 * Given a string S which consists of both lowercase and uppercase alphabetical letters, you have to write a function to check if string S is a permutation of a palindrome or not. Note: Characters are case sensitive i.e. ‘a’ is not the same as ‘A’.
 */
public class  PermutationPalindrome {

	 static int NO_OF_CHARS = 256;
	 
	public static int isPermutationPalindrome(String s) {

		// Create a count array and initialize all
        // values as 0
        int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);
  
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < s.length(); i++)
            count[(int)(s.charAt(i))]++;
  
        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) == 1)
                odd++;
  
            if (odd > 1)
                return 0;
        }
  
        // Return true if odd count is 0 or 1,
        return 1;
	}

	public static void  main (String args []) {

		Scanner sc =  new  Scanner (System.in);
		int t = 1;
		t = sc.nextInt();
		sc.nextLine();
		while (t > 0) {
			t--;
			String s = new String();
			s = sc.next();

			int flag = isPermutationPalindrome(s);
			if (flag == 1) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}

}
