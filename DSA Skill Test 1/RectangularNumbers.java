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

package group1set1;

import java.util.*;

public class RectangularNumbers {

	public static int[][] rectangularNumbers(int n) {
		// Write your code here.
		int size = 2 * n - 1;
		int[][] res = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				res[i][j] = Math.max(Math.abs(i - size / 2), Math.abs(j - size / 2)) + 1;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = rectangularNumbers(n);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
		sc.close();
	}
}
