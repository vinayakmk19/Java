/*
 * 
 									***** Multiplication (Recursive) *****

	Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
	Input format :
	Line 1 : Integer M
	Line 2 : Integer N
	Output format :
	M x N
	Constraints :
	0 <= M <= 1000
	0 <= N <= 1000
	Sample Input 1 :
	3 
	5
	Sample Output 1 :
	15
	Sample Input 2 :
	4 
	0
	Sample Output 2 :
	0


 */

package assignment;

import java.util.Scanner;

public class MultiplicationRecursively {

	public static int multiplyTwoIntegers(int a, int b) {

		if (a == 0) {
			return 0;
		}

		return b + multiplyTwoIntegers(a - 1, b);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}

}
