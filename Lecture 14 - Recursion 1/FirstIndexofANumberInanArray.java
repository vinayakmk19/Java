/*
 * 
 					***** First Index Of a Number in an Array - Question *****

	Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
	First index means, the index of first occurrence of x in the input array.
	Do this recursively. Indexing in the array starts from 0.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	first index or -1
	Constraints :
	1 <= N <= 10^3
	Sample Input :
	4
	9 8 10 8
	8
	Sample Output :
	1


 */

package recursion1;

import java.util.Scanner;

public class FirstIndexofANumberInanArray {

	public static int firstIndex(int[] arr, int num) {
		return firstIndex(arr, num, 0);
	}

	public static int firstIndex(int[] arr, int num, int start) {
		if (start == arr.length - 1) {
			return -1;
		}

		if (arr[start] == num) {
			return start;
		}
		return firstIndex(arr, num, start + 1);

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
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}

}
