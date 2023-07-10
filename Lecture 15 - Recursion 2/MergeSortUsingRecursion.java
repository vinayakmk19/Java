/*
 							***** Merge Sort - Problem Statement *****

	Given the starting 'l' and the ending 'r' positions of the array 'ARR', your task is sorting the elements between 'l' and 'r'.
	Note:
	Change in the input array itself. So no need to return or print anything.
	Example:
	Input: ‘N’ = 7,
	'ARR' = [2, 13, 4, 1, 3, 6, 28]
	
	Output: [1 2 3 4 6 13 28]
	
	Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
	Input format :
	The first line contains an integer 'N' representing the size of the array/list.
	
	The second line contains 'N' single space-separated integers representing the elements in the array/list.
	Output format :
	You don't need to return anything. In the output, you will see the array after modification is done by you.
	Constraints :
	1 <= N <= 10^3
	0 <= ARR[i] <= 10^9
	Sample Input 1:
	7
	2 13 4 1 3 6 28
	Sample Output 1:
	1 2 3 4 6 13 28
	Explanation of Sample Output 1:
	After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
	Sample Input 2:
	5
	9 3 6 2 0
	Sample Output 2:
	0 2 3 6 9
	Explanation of Sample Output 2:
	After applying 'merge sort' on the input array, the output is [0 2 3 6 9].


 */

package recursion2;

import java.util.Iterator;
import java.util.Scanner;

public class MergeSortUsingRecursion {

	public static void merge(int s1[], int s2[], int result[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < s1.length && j < s2.length) {
			if (s1[i] <= s2[j]) {
				result[k] = s1[i];
				i++;
				k++;
			} else {
				result[k] = s2[j];
				j++;
				k++;
			}
		}
		if (i < s1.length) {
			while (i < s1.length) {
				result[k] = s1[i];
				i++;
				k++;
			}
		}

		if (j < s2.length) {
			while (j < s2.length) {
				result[k] = s2[j];
				j++;
				k++;
			}
		}

	}

	public static void mergeSort(int arr[]) {

		if (arr.length == 1) {
			return;
		}

		int b[] = new int[arr.length / 2];
		int c[] = new int[arr.length - b.length];

		for (int i = 0; i < arr.length / 2; i++) {
			b[i] = arr[i];

		}

		for (int i = arr.length / 2; i < arr.length; i++) {
			c[i - arr.length / 2] = arr[i];

		}

		mergeSort(b);
		mergeSort(c);
		merge(b, c, arr);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
