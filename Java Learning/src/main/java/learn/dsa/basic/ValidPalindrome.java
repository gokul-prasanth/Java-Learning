package learn.dsa.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPalindrome {
	 // Implement your solution by completing the below function
    public String isPalindrome(String s) {
    	
    	s = s.toLowerCase();
    	s = s.replaceAll("[^A-Za-z0-9]", "");
    	
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i) != s.charAt(s.length()-1-i)) {
    			return "false";
    		}
    	}
    	return "true";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        String result = new ValidPalindrome().isPalindrome(line);
        System.out.print(result);
    }
}