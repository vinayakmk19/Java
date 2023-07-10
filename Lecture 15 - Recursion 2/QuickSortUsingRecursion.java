/*
 * 
 							***** Quick Sort - Problem Statement *****

	Sort an array A using Quick Sort.
	Change in the input array itself. So no need to return or print anything.
	
	
	Input format :
//	Line 1 : Integer n i.e. Array size
	Line 2 : Array elements (separated by space)
	Output format :
	Array elements in increasing order (separated by space)
	Constraints :
	1 <= n <= 10^3
	Sample Input 1 :
	6 
	2 6 8 5 4 3
	Sample Output 1 :
	2 3 4 5 6 8
	Sample Input 2 :
	5
	1 2 3 5 7
	Sample Output 2 :
	1 2 3 5 7 


 */

package recursion2;

import java.util.Scanner;

public class QuickSortUsingRecursion {

	public static void quickSort(int[] arr, int si, int ei) {
		if (si > ei) {
			return;
		}

		int pivotIndex = partition(arr, si, ei);
		quickSort(arr, pivotIndex + 1, ei);
		quickSort(arr, si, pivotIndex - 1);
	}

	public static int partition(int arr[], int si, int ei) {
		int pivotElement = arr[si];
		int smallCOunt = 0;

		for (int i = si + 1; i < arr.length; i++) {
			if (arr[i] < pivotElement) {
				smallCOunt++;
			}

		}
		int temp = arr[si + smallCOunt];
		arr[si + smallCOunt] = pivotElement;
		arr[si] = temp;

		int i = si;
		int j = ei;
		while (i < j) {
			if (arr[i] < pivotElement) {
				i++;
			} else if (arr[j] >= pivotElement) {
				j--;
			} else {
				int temp2 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp2;
			}
		}
		return si + smallCOunt;
	}

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input, 0, input.length - 1);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
