/*
 						***** Remove Consecutive Duplicates *****

	For a given string(str), remove all the consecutive duplicate characters.
	Example:
	Input String: "aaaa"
	Expected Output: "a"
	
	Input String: "aabbbcc"
	Expected Output: "abc"
	 Input Format:
	The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
	Output Format:
	The only line of output prints the updated string.
	Note:
	You are not required to print anything. It has already been taken care of.
	Constraints:
	0 <= N <= 10^6
	Where N is the length of the input string.
	
	Time Limit: 1 second
	Sample Input 1:
	aabccbaa
	Sample Output 1:
	abcba
	Sample Input 2:
	xxyyzxx
	Sample Output 2:
	xyzx

 */

package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution2 {
	public static String removeConsecutiveDuplicates(String str) {

		String result = "";
		result = result + str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != result.charAt(result.length() - 1)) {
				result = result + str.charAt(i);
			}
		}

		return result;
	}
}

public class RemoveConsecutiveDuplicates {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		String ans = Solution2.removeConsecutiveDuplicates(str);

		System.out.println(ans);

	}

}
