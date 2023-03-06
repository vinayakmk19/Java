/*
		 				***** Number Star Pattern *****

		Print the following pattern for given number of rows.
		Input format :
		
		Line 1 : N (Total number of rows)
		
		Sample Input :
		   5
		Sample Output :
		1234554321
		1234**4321
		123****321
		12******21
		1********1
 */

package test2;

import java.util.*;

public class NumberStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= 2 * i - 2; k++) {
				System.out.print("*");
			}
			for (int m = n - i + 1; m >= 1; m--) {
				System.out.print(m);
			}
			System.out.println();

		}

	}

}
