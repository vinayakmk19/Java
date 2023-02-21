/*
		 Half Diamond Pattern
		Send Feedback
		Write a program to print N number of rows for Half Diamond pattern using stars and numbers
		Note : There are no spaces between the characters in a single line.
		
		
		Input Format :
		A single integer: N
		Output Format :
		Required Pattern
		Constraints :
		0 <= N <= 50
		Sample Input 1 :
		3
		Sample Output 1 :
		*
		*1*
		*121*
		*12321*
		*121*
		*1*
		*
		Sample Input 2 :
		 5
		Sample Output 2 :
		*
		*1*
		*121*
		*12321*
		*1234321*
		*123454321*
		*1234321*
		*12321*
		*121*
		*1*
		*



 * 
 */
package assignment;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = 1;
		System.out.println("*");
		while (i <= n) {
			int j = 1;
			System.out.print("*");
			while (j <= i) {
				System.out.print(j);
				j = j + 1;
			}

			int k = i - 1;
			while (k >= 1) {
				System.out.print(k);
				k = k - 1;
			}
			System.out.print("*");

			System.out.println();
			i = i + 1;
		}

		int j = 1;
		while (j <= n - 1) {
			int spaces = 1;
			System.out.print("*");
			while (spaces <= n - j) {
				System.out.print(spaces);
				spaces = spaces + 1;
			}

			int k = n - j - 1;
			while (k >= 1) {
				System.out.print(k);
				k = k - 1;
			}
			System.out.print("*");
			j = j + 1;
			System.out.println();

		}
		System.out.print("*");

	}

}
