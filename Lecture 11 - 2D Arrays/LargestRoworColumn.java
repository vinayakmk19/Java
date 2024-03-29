/*
 										****** Largest Row or Column ******
	For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
	Note :
	If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
	Input Format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
	
	Second line onwards, the next 'N' lines or rows represent the ith row values.
	
	Each of the ith row constitutes 'M' column values separated by a single space.
	Output Format :
	For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
	OR
	If column sum is maximum, then print: "column" <col_index> <col_sum>
	It will be printed in a single line separated by a single space between each piece of information.
	
	Output for every test case will be printed in a seperate line.
	 Consider :
	If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
	Constraints :
	1 <= t <= 10^2
	1 <= N <= 10^3
	1 <= M <= 10^3
	Time Limit: 1sec


 */

package arrays2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution2 {
	public static void findLargest(int mat[][]) {
		int Lrow = Integer.MIN_VALUE;
		int Lcol = Integer.MIN_VALUE;
		int C_index = 0;
		int R_index = 0;

//Row Checking
		if (mat.length > 0) {
			for (int i = 0; i < mat.length; i++) {
				int sum = 0;
				for (int ele : mat[i])
					sum += ele;
				if (Lrow < sum) {
					Lrow = sum;
					R_index = i;
				}
			}
			// Now Col Checking
			for (int i = 0; i < mat[0].length; i++) {
				int sum = 0;
				for (int j = 0; j < mat.length; j++) {
					sum += mat[j][i];

				}
				if (Lcol < sum) {
					Lcol = sum;
					C_index = i;
				}
			}
		}
//      Now Comparing Both largest
		if (Lrow >= Lcol)
			System.out.println("row " + R_index + " " + Lrow);
		else
			System.out.println("column " + C_index + " " + Lcol);
	}

}

public class LargestRoworColumn {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[][] take2DInput() throws IOException {
		String[] strRowsCols = br.readLine().trim().split("\\s");
		int n_rows = Integer.parseInt(strRowsCols[0]);
		int m_cols = Integer.parseInt(strRowsCols[1]);

		if (n_rows == 0) {
			return new int[0][0];
		}

		int[][] mat = new int[n_rows][m_cols];

		for (int row = 0; row < n_rows; row++) {
			String[] strNums;
			strNums = br.readLine().trim().split("\\s");

			for (int col = 0; col < m_cols; col++) {
				mat[row][col] = Integer.parseInt(strNums[col]);
			}
		}

		return mat;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[][] mat = take2DInput();

			Solution2.findLargest(mat);
			System.out.println();

			t -= 1;
		}
	}
}