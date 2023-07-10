/*
 						***** Remove Duplicates Recursively *****

	Given a string S, remove consecutive duplicates from it recursively.
	Input Format :
	String S
	Output Format :
	Output string
	Constraints :
	1 <= |S| <= 10^3
	where |S| represents the length of string
	Sample Input 1 :
	aabccba
	Sample Output 1 :
	abcba
	Sample Input 2 :
	xxxyyyzwwzzz
	Sample Output 2 :
	xyzwz

 */

package recursion2;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
	public static String removeConsecutiveDuplicates(String str) {
		if (str.length() == 1) {
			return str;
		}

		String smallOutput = removeConsecutiveDuplicates(str.substring(1));
		if (smallOutput.charAt(0) == str.charAt(0)) {
			return smallOutput;
		}
		return str.charAt(0) + smallOutput;

	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}

}
