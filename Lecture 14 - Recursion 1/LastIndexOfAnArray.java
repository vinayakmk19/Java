/*
 * 
 * 
 					***** Last Index Of a Number in an Array - Question *****

	Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
	Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
	You should start traversing your array from 0, not from (N - 1).
	Do this recursively. Indexing in the array starts from 0.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	last index or -1
	Constraints :
	1 <= N <= 10^3
	Sample Input :
	4
	9 8 10 8
	8
	Sample Output :
	3


 */

package recursion1;

import java.util.Scanner;

public class LastIndexOfAnArray {

	public static int lastIndex(int[] arr, int num) {

		return lastIndex(arr, num, 0);
	}

	public static int lastIndex(int[] arr, int num, int start) {
		if (start == arr.length) {
			return -1;
		}

		int k = lastIndex(arr, num, start + 1);
		if (k != -1) {
			return k;
		} else {

			if (arr[start] == num) {
				return start;
			} else {
				return -1;
			}
		}
	}

	/*
	 * public static int lastIndex(int[] arr, int num) {
	 * 
	 * return lastIndex(arr,0,arr.length-1,num); } public static int lastIndex(int[]
	 * arr,int start,int end,int num) {
	 * 
	 * if(start > end) { return -1; } if(arr[end] == num){ return end; } return
	 * lastIndex(arr, start, end-1, num);
	 * 
	 * 
	 */

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
		System.out.println(lastIndex(input, x));
	}

}
