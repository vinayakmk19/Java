/*
 * 
 									***** Check Number in Array *****

	Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
	Do this recursively.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	'true' or 'false'
	Constraints :
	1 <= N <= 10^3
	Sample Input 1 :
	3
	9 8 10
	8
	Sample Output 1 :
	true
	Sample Input 2 :
	3
	9 8 10
	2
	Sample Output 2 :
	false


 */

package recursion1;

import java.util.Scanner;

public class CheckNumberInArray {

	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input, x, 0);
	}

	public static boolean checkNumber(int input[], int x, int start) {
		if (start == input.length) {
			return false;
		}

		if (input[start] == x) {
			return true;
		}

		return checkNumber(input, x, start + 1);
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));

	}

}
