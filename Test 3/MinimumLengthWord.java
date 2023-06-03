/*
 										***** Minimum Length Word *****

	Given a string S (that can contain multiple words), you need to find the word which has minimum length.
	Note : If multiple words are of same length, then answer will be first minimum length word in the string.
	Words are seperated by single space only.
	Input Format :
	String S
	Output Format :
	Minimum length word
	Constraints :
	1 <= Length of String S <= 10^5
	Sample Input 1 :
	this is test string
	Sample Output 1 :
	is
	Sample Input 2 :
	abc de ghihjk a uvw h j
	Sample Output 2 :
	a


 */

package test3;

import java.util.Scanner;

class Solution2 {

	public static String minLengthWord(String input) {
//		String[] arr = input.split(" ");
//		int cnt = Integer.MAX_VALUE;
//		String result = "";
//
//		for (String string : arr) {
//			if (string.length() <= cnt) {
//				result = string;
//				cnt = string.length();
//			}
//		}
//		return result;

		int minStart = -1;
		int minLength = Integer.MAX_VALUE;
		int currentStart = 0;
		int i = 0;

		for (; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				int currentWordLength = i - currentStart;
				if (currentWordLength < minLength) {
					minStart = currentStart;
					minLength = currentWordLength;
				}
				currentStart = i + 1;
			}
		}
		if (minStart == -1) {
			return input;

		} else {
			int currentWordLength = i - currentStart;
			if (currentWordLength < minLength) {
				minStart = currentStart;
				minLength = currentWordLength;
			}
			return input.substring(minStart, minStart + minLength);

		}
	}
}

public class MinimumLengthWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		System.out.println(Solution2.minLengthWord(str));
	}

}
