/*
 								***** Pair sum in array *****

	You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
	Note:
	Given array/list can contain duplicate elements. 
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains an integer 'N' representing the size of the first array/list.
	
	Second line contains 'N' single space separated integers representing the elements in the array/list.
	
	Third line contains an integer 'num'.
	Output format :
	For each test case, print the total number of pairs present in the array/list.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^4
	0 <= num <= 10^9
	
	Time Limit: 1 sec
	Sample Input 1:
	1
	9
	1 3 6 2 5 4 3 2 4
	7
	Sample Output 1:
	7
	Sample Input 2:
	2
	9
	1 3 6 2 5 4 3 2 4
	12
	6
	2 8 10 5 -2 5
	10
	Sample Output 2:
	0
	2
	
	
	 Explanation for Input 2:
	Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.
	
	For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).


 */

package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution3 {

	public static int pairSum(int[] arr, int num) {

		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (num == arr[i] + arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

}

public class PairSumInAArray {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] arr = takeInput();
			int num = Integer.parseInt(br.readLine().trim());
			System.out.println(Solution3.pairSum(arr, num));

			t -= 1;
		}
	}
}
