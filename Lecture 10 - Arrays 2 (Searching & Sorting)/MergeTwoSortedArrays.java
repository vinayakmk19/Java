/*
 * 
 									****** Code Merge Two Sorted Arrays ******g

	You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
	Input Format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains an integer 'N' representing the size of the first array/list.
	
	Second line contains 'N' single space separated integers representing the elements of the first array/list.
	
	Third line contains an integer 'M' representing the size of the second array/list.
	
	Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
	Output Format :
	For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^5
	0 <= M <= 10^5
	Time Limit: 1 sec 
	Sample Input 1 :
	1
	5
	1 3 4 7 11
	4
	2 4 6 13
	Sample Output 1 :
	1 2 3 4 4 6 7 11 13 
	Sample Input 2 :
	2
	3
	10 100 500
	7
	4 7 9 25 30 300 450
	4
	7 45 89 90
	0
	Sample Output 2 :
	4 7 9 10 25 30 100 300 450 500
	7 45 89 90


 */

package arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Your code goes here.....

class Solution5 {
	public static int[] merge(int arr1[], int arr2[]) {

		int m = arr1.length;
		int n = arr2.length;
		int arr[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			} else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

		return arr;
	}
}

//	 END

public class MergeTwoSortedArrays {

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

			int[] input1 = takeInput();
			int[] input2 = takeInput();
			int[] ans = Solution5.merge(input1, input2);
			printArray(ans);

			t -= 1;
		}
	}
}
