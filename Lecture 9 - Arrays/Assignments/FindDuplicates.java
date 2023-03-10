/*
 					****** Find Duplicate ******


	You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
	Note :
	Duplicate number is always present in the given array/list.
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains an integer 'N' representing the size of the array/list.
	
	Second line contains 'N' single space separated integers representing the elements in the array/list.
	Output Format :
	For each test case, print the duplicate element in the array/list.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^3
	Time Limit: 1 sec
	Sample Input 1:
	1
	9
	0 7 2 5 4 7 1 3 6
	Sample Output 1:
	7
	Sample Input 2:
	2
	5
	0 2 1 3 1
	7
	0 3 1 5 4 3 2
	Sample Output 2:
	1
	3

 */

package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write your code Here....

class Solution2 {

	public static int duplicateNumber(int[] input) {

		int duplicateValue = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {

//					System.out.println(input[j]);
					duplicateValue = input[j];

				}
			}

		}

		return duplicateValue;
	}

//	OR

//	public static int duplicateNumber(int arr[]) {
//
//		int sum = 0;
//		for (int i : arr) {
//			sum += i;
//		}
//		return sum - (arr.length - 2) * (arr.length - 1) / 2;
//	}

}

//END

public class FindDuplicates {

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

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] input = takeInput();
			System.out.println(Solution2.duplicateNumber(input));

			t -= 1;
		}
	}
}
