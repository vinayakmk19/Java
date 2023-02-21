/*
		 Parallelogram Pattern

		Write a program to print parallelogram pattern for the given N number of rows.
		For N = 4
		
		
		
		The dots represent spaces.
		Input Format :
		 A single integer : N
		Output Format :
		Required Pattern
		Constraints :
		0 <= N <= 50
		Sample Input 1 :
		3
		Sample Output 1 :
		***
		 ***
		  ***
		Sample Input 2 :
		5
		Sample Output 2 :
		*****
		 *****
		  *****
		   *****
		    *****



 * 
 */
package assignment;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i - 1) {
				System.out.print(" ");
				j = j + 1;
			}
			int k = 1;
			while (k <= n) {
				System.out.print("*");
				k = k + 1;
			}

			System.out.println();
			i = i + 1;

		}

	}

}
