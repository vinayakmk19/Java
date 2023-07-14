/*
 * 
 											***** Print 2D Array *****

	Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
	Input format :
	Line 1 : No of rows (n) and no of columns (m) (separated by single space)
	Line 2 : Row 1 elements (separated by space)
	Line 3 : Row 2 elements (separated by space)
	Line 4 : and so on
	Sample Input 1:
	3 3
	1 2 3
	4 5 6
	7 8 9
	Sample Output 1 :
	1 2 3
	1 2 3
	1 2 3
	4 5 6
	4 5 6
	7 8 9


 */

package test4;

import java.util.Scanner;

public class Print2DArray {

	public static void print2DArray(int input[][]) {
		int k = input.length;

		for (int i = 0; i < input.length; i++) {
			for (int l = k - 1; l >= 0; l--) {
				for (int j = 0; j < input[0].length; j++) {
					System.out.print(input[i][j] + " ");

				}
				System.out.println();
			}
			k--;
		}
	}

	static Scanner s = new Scanner(System.in);

	public static int[][] takeInput() {
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		print2DArray(input);
	}

}
