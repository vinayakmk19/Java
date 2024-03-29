package recursion2;

import java.util.Scanner;

public class ReplaceCharacterFromString {

	public static String replaceChar(String s, char a, char b) {
		if (s.length() == 0) {
			return s;
		}

		String smallOutput = replaceChar(s.substring(1), a, b);

		if (s.charAt(0) == a) {
			return b + smallOutput;
		} else {
			return s.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(replaceChar(str, 'x', 'y'));

	}

}
