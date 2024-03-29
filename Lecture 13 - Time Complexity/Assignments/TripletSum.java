/*
 									***** Triplet sum *****

	You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
	Note :
	Given array/list can contain duplicate elements.
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	First line of each test case or query contains an integer 'N' representing the size of the first array/list.
	
	Second line contains 'N' single space separated integers representing the elements in the array/list.
	
	Third line contains an integer 'X'.
	Output format :
	For each test case, print the total number of triplets present in the array/list.
	
	Output for every test case will be printed in a separate line.
	Constraints :
	1 <= t <= 10^2
	0 <= N <= 10^3
	0 <= X <= 10^9
	
	Time Limit: 1 sec
	Sample Input 1:
	1
	7
	1 2 3 4 5 6 7 
	12
	Sample Output 1:
	5
	Sample Input 2:
	2
	7
	1 2 3 4 5 6 7 
	19
	9
	2 -5 8 -6 0 5 10 11 -3
	10
	Sample Output 2:
	0
	5
	
	
	 Explanation for Input 2:
	Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.
	
	For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)


 */

package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution4 {

	public static int tripletSum(int[] arr, int num) {
//		int count = 0;
//		for (int i = 0; i < arr.length - 2; i++) {
//			for (int j = i + 1; j < arr.length - 1; j++) {
//				for (int k = j + 1; k < arr.length; k++) {
//					if (num == arr[i] + arr[j] + arr[k]) {
//						count++;
//					}
//				}
//			}
//		}
//		return count;

//		OR

		Arrays.sort(arr);
		int n = arr.length;

		int numTriplets = 0;

		for (int i = 0; i < n; i++) {
			int pairSum = num - arr[i];
			int numPairs = 0;

			int start = i + 1;
			int stop = n - 1;

			while (start < stop) {
				if (arr[start] + arr[stop] < pairSum) {
					start++;
				} else if (arr[start] + arr[stop] > pairSum) {
					stop--;
				} else {
					if (arr[start] == arr[stop]) {
						int totalCount = (stop - start) + 1;
						numPairs += (totalCount * (totalCount - 1) / 2);
						break;
					}

					int tempI = start + 1;
					int tempJ = stop - 1;

					while (tempI <= tempJ && arr[start] == arr[tempI]) {
						tempI++;
					}

					while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
						tempJ--;
					}

					int totalElementFromStart = (tempI - start);
					int totalElementFromEnd = stop - tempJ;

					numPairs += (totalElementFromStart * totalElementFromEnd);

					start = tempI;
					stop = tempJ;
				}
			}
			numTriplets += numPairs;
		}
		return numTriplets;

	}
}

public class TripletSum {

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
			System.out.println(Solution4.tripletSum(arr, num));

			t -= 1;
		}
	}
}
