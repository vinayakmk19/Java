/*
 								***** String Palindrome *****

	Given a string, determine if it is a palindrome, considering only alphanumeric characters.
	Palindrome
	A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
	Example:
	If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.
	
	The expected output for this example will print, 'true'.
	From that being said, you are required to return a boolean value from the function that has been asked to implement.
	Input Format:
	The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
	Output Format:
	The only line of output prints either 'true' or 'false'.
	Note:
	You are not required to print anything. It has already been taken care of.
	Constraints:
	0 <= N <= 10^6
	Where N is the length of the input string.
	
	Time Limit: 1 second
	Sample Input 1 :
	abcdcba
	Sample Output 1 :
	true 
	Sample Input 2:
	coding
	Sample Output 2:
	false
	
 */



package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

class Solution3 {

	public static boolean isPalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

public class StringPalindrome {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		boolean ans = Solution3.isPalindrome(str);
		System.out.println(ans);
	}
}
