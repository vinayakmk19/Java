/*
 								***** Number of Digits *****

	Given the number 'n', find out and return the number of digits present in a number .
	Input Format :
	Integer n
	Output Format :
	Count of digits
	Constraints :
	1 <= n <= 10^6
	Sample Input 1 :
	 156
	Sample Output 1 :
	3
	Sample Input 2 :
	 7
	Sample Output 2 :
	1

 */

package recursion1;

import java.util.Scanner;

public class NumberofDigits {

	public static int count(int n) {
		if (n == 0) {
			return 0;
		}
		return 1 + count(n / 10);

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
	}

}
