/*
 										****** Sort 0 1 2 ******

	You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
	'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
	Note:
	You need to change in the given array/list itself. Hence, no need to return or print anything. 
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains an integer 'N' representing the size of the array/list.
	
	Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
	Output Format :
	For each test case, print the sorted array/list elements in a row separated by a single space.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^5
	Time Limit: 1 sec
	Sample Input 1:
	1
	7
	0 1 2 0 2 0 1
	Sample Output 1:
	0 0 0 1 1 2 2 
	Sample Input 2:
	2
	5
	2 2 0 1 1
	7
	0 1 2 0 1 2 0
	Sample Output 2:
	0 1 1 2 2 
	0 0 0 1 1 2 2


 */


package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution5 {
	public static void sort012(int[] arr) {

		int zero = 0;
		int one = 0;

		for (int ele : arr) {
			if (ele == 0)
				zero++;
			else if (ele == 1)
				one++;
			// else if (ele==2)two++;
		}
		int two = arr.length - zero - one; // Another Way to Get Two
		for (int i = arr.length - two; i < arr.length; i++) {
			arr[i] = 2;
		}
		for (int i = arr.length - two - one; i < arr.length - two; i++) {
			arr[i] = 1;
		}
		for (int i = 0; i < zero; i++) {
			arr[i] = 0;
		}

		// OR

//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

	}
}

public class Sort012 {

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

			int[] input = takeInput();
			Solution5.sort012(input);
			printArray(input);

			t -= 1;
		}
	}
}
