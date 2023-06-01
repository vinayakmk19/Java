package strings;

import java.util.*;

import java.util.Scanner;

class Solution2 {
	public static String reverseString(String str) {

		String reverseString = "";

		for (int i = 0; i < str.length(); i++) {
			reverseString = str.charAt(i) + reverseString;
		}

		return reverseString;
	}
}

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String reversedString = Solution2.reverseString(str);
		System.out.println(reversedString);
	}

}
