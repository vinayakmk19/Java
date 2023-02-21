/*
		 Odd Square
			Send Feedback
			Write a program to print the pattern for the given N number of rows.
			For N = 4
			1357
			3571
			5713
			7135
			Input Format :
			A single integer: N
			Output Format :
			Required Pattern
			Constraints :
			0 <= N <= 50
			Sample Input 1 :
			3
			Sample Output 1 :
			135
			351
			513
			Sample Input 2 :
			 5
			Sample Output 2 :
			13579
			35791
			57913
			79135
			91357

 * 
 */

package assignment;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = 1;
		while (i <= n) {

			int j = 1;
			int p = 2 * i - 1;
			while (j <= n - i + 1) {
				if (p % 2 != 0) {
					System.out.print(p);
				}
				j = j + 1;
				p = p + 2;

			}

			int k = 1;
			int m = 1;
			while (k <= i - 1) {
				if (m % 2 != 0) {
					System.out.print(m);

				}
				k = k + 1;
				m = m + 2;
			}

			System.out.println();
			i = i + 1;

		}

	}

}
