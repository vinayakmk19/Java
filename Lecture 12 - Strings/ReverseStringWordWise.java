/*
 						***** Reverse String Wordwise ****
 					
	Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
	Input format :
	String in a single line
	Output format :
	Word wise reversed string in a single line
	Constraints :
	0 <= |S| <= 10^7
	where |S| represents the length of string, S.
	Sample Input 1:
	Welcome to Coding Ninjas
	Sample Output 1:
	Ninjas Coding to Welcome
	Sample Input 2:
	Always indent your code
	Sample Output 2:
	code your indent Always
 
 
 */



package strings;

import java.util.*;

public class ReverseStringWordWise {

	class Solution {
		public static String reverseWordWise(String input) {
			String[] arrOdStr = input.split(" ");
			String reverseWord = "";
			for (int i = arrOdStr.length - 1; i >= 0; i--) {
				reverseWord += arrOdStr[i] + " ";
			}
			return reverseWord;

		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseWordWise(input));
	}

}
