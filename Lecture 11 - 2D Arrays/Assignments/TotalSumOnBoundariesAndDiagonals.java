/*
 					***** Total Sum on the Boundaries and Diagonals *****

	For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
	Input format:
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.
	
	Second line onwards, the next 'N' lines or rows represent the ith row values.
	
	Each of the ith row constitutes 'N' column values separated by a single space.
	Output format:
	For each test case, print the single integer denoting the sum.
	
	Output for every test case will be printed in a seperate line.
	Constraints:
	1 <= t <= 10^2
	0 <= N <= 10^3
	Time Limit: 1sec
	Sample input 1:
	1
	3
	1 2 3
	4 5 6
	7 8 9
	Sample Output 1:
	45
	Explanation for Sample Output 1:
	The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 
	
	The first-diagonal elements are 1, 5 and 9. 
	
	The second-diagonal elements are 3, 5 and 7.
	
	We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.
	
	Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
	Sample input 2:
	2
	5
	1 2 3 4 5
	6 7 8 9 10
	11 12 13 14 15
	16 17 18 19 20
	21 22 23 24 25
	4
	1 2 3 10
	4 5 6 11
	7 8 9 12
	13 14 15 16
	Sample Output 2:
	273
	136


 */

package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

	public static void totalSum(int[][] mat) {
		int horizontal = mat.length - 1;
		if (horizontal == -1) {
			System.out.println(0);
			System.exit(0);
		}

		int vertically = mat[0].length - 1;
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == 0 | j == 0 | i == horizontal | j == vertically | i == j | j == horizontal - i) {
//                    System.out.print(mat[i][j]+" ");
					sum += mat[i][j];
				}
			}
		}
//        return sum;
		System.out.print(sum);
	}

}

public class TotalSumOnBoundariesAndDiagonals {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[][] take2DInput() throws IOException {
		int n = Integer.parseInt(br.readLine().trim());

		if (n == 0) {
			return new int[0][0];
		}

		int[][] mat = new int[n][n];

		for (int row = 0; row < n; row++) {
			String[] strNums;
			strNums = br.readLine().trim().split("\\s");

			for (int col = 0; col < n; col++) {
				mat[row][col] = Integer.parseInt(strNums[col]);
			}
		}

		return mat;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[][] mat = take2DInput();

			Solution.totalSum(mat);
			System.out.println();

			t -= 1;
		}
	}
}
