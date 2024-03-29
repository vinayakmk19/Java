/*
 									***** Rectangular numbers *****

	Print the following pattern for the given number of rows.
	Pattern for N = 4
	4444444
	4333334
	4322234
	4321234
	4322234
	4333334  
	4444444
	Input format : N (Total no. of rows)
	
	Output format : Pattern in N lines
	
	Sample Input :
	3
	Sample Output :
	33333
	32223
	32123
	32223
	33333


 */

package coursetest;

import java.util.*;

public class RectangularNumber {

	public static void print(int n) {

		int s = 2 * n - 1;

		for (int i = 0; i < (s / 2) + 1; i++) {
			int m = n;
			for (int j = 0; j < i; j++) {
				System.out.print(m);
				m--;
			}
			for (int k = 0; k < s - (2 * i); k++) {
				System.out.print(n - i);
			}
			m = n - i + 1;

			for (int l = 0; l < i; l++) {
				System.out.print(m);
				m++;
			}
			System.out.println();
		}

		for (int i = (s / 2) - 1; i >= 0; i--) {
			int m = n;
			for (int j = 0; j < i; j++) {
				System.out.print(m);
				m--;
			}
			for (int k = 0; k < s - 2 * i; k++) {
				System.out.print(n - i);
			}
			m = n - i + 1;
			for (int l = 0; l < i; l++) {
				System.out.print(m);
				m++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RectangularNumber.print(n);
	}
}
