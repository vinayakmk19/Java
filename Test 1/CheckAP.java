/*
 											***** Check AP *****
	Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
	Input format :
	Line 1 : n
	Line 2 : n numbers
	Sample Input 1 :
	6
	2 6 10 14 18 22
	Sample Output 1 :
	true
	Sample Input 2 :
	6
	2 6 10 15 19 23
	Sample Output 2 :
	false
 */

package test1;

import java.util.Scanner;

public class CheckAP {

	public static boolean solution(int[] arr, int n) {
		if (arr.length <= 1) {
			return true;
		}

		int d = arr[1] - arr[0];
		for (int i = 2; i < n; i++)
			if (arr[i] - arr[i - 1] != d)
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr, n));

	}

}
