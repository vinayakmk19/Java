/*
 												***** Faulty Keyboard *****

	Some of the keys on your keyboard are faulty. When you press a key, it may register more than once. That means if you want to type "code", the keyboard may interpret it as "code", "cccoddee" or "coode" or "codeeeee", etc. So, by pressing the keys C, O, D, and E in that order, you may get any of the above-mentioned words.
	However, there are certain words that you will not get like, "cddde", "cod", "coeeeeed", etc.
	You will be given 'N' pairs of words. The first word of each pair is what you intended to write and the second one is what the keyboard interprets it as. You need to figure out whether the second word can actually be a possible interpretation of the first word.
	Input format
	The first line of the input contains a positive integer, N which represents the number of pairs of words
	Every two lines after it will contain two words. The first one is what you typed, the second one is a potential interpretation of that word by the faulty keyboard.
	Output format
	The output will contain 'N' lines. Each line will be either "true" if the second word is a possible interpretation of the first word and "false" if it's not.
	Constraints
	1 <= N <= 10^5
	1 <= L <= 10^6
	where L is the total number of letters in all of the 2*N words
	Time limit: 1 sec
	Sample Input 1
	2
	code
	cooodeee
	hello
	hheeeloo
	Sample Output 1
	true
	false


 */

package coursetest;

import java.util.*;

public class FaultyKeyword {
	public static boolean isPossible(String str, String str1) {

		if (str.length() > str1.length()) {
			return false;
		}
		int i = 0;
		int j = 0;

		while (i < str.length() && j < str1.length()) {
			if (str.charAt(i) == str1.charAt(j)) {
				i++;
				j++;
			} else if (i > 0 && str.charAt(i - 1) == str1.charAt(j)) {
				j++;
			} else {
				return false;
			}
		}

		while (j < str1.length()) {
			if (str.charAt(i - 1) != str1.charAt(j)) {
				return false;
			}
			j++;
		}

		return i < str.length() ? false : true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String str1 = sc.next();

		for (int i = 1; i <= n; i++) {
			boolean res = isPossible(str, str1);
			System.out.println(res);
		}

	}

}
