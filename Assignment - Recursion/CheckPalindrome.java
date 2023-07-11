/*
 * 
 						***** Check Palindrome (recursive) *****

	Check whether a given String 'S' is a palindrome using recursion.
	
	
	Return true or false.


	Note:
	You don’t need to print anything. Just implement the given function.
	Example:
	Input: s = "racecar"
	Output: true
	Explanation: "racecar" is a palindrome.
	Input Format:
	The first and only line of the input contains string S.
	Output format:
	Return a boolean value True or False.
	Sample Input 1:
	abbba
	Sample Output 1:
	true
	Explanation Of Sample Input 1 :
	“abbba” is a palindrome
	Sample Input 2:
	abcd
	Sample Output 2:
	false
	Explanation Of Sample Input 2 :
	“abcd” is not a palindrome.
	Expected time complexity:
	Expected time complexity is O(n).
	Constraints:
	0 <= |S| <= 10^6
	where |S| represents the length of string S.


 */

package assignment;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
	public static boolean isPalindrome(String str) {
		int length = str.length() - 1;

		return isStringPalindrome(str, 0, length);

	}

	public static boolean isStringPalindrome(String str, int start, int end) {

		if (start >= end) {
			return true;
		}

		if (str.charAt(start) != str.charAt(end)) {
			return false;

		}

		return isStringPalindrome(str, start + 1, end - 1);

	}

}

public class CheckPalindrome {
	public static class FastReader {

		BufferedReader br;
		StringTokenizer root;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine(), " ");
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

	}

	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static FastReader sc = new FastReader();

	private static int t;
	private static String[] str;

	private static void takeInput() {
		t = 1;
		str = new String[t];
		for (int i = 0; i < t; i++) {
			str[i] = sc.next();
		}
	}

	private static void execute() {
		for (int i = 0; i < t; i++) {
			Solution.isPalindrome(str[i]);
		}
	}

	private static void executeAndPrintOutput() {
		for (int i = 0; i < t; i++) {
			boolean ans = Solution.isPalindrome(str[i]);
			if (ans)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}

	public static void main(String[] args) {
		takeInput();
		executeAndPrintOutput();
		out.close();
	}
}
