package recursion2;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

	public static int binarySearchUsingRecursion(int a[], int x) {
		return binarySearchUsingRecursion(a, x, 0, a.length);
	}

	public static int binarySearchUsingRecursion(int a[], int x, int start, int end) {
		if (start > end) {
			return -1;
		}

		int midIndex = (start + end) / 2;

		if (a[midIndex] == x) {
			return midIndex;
		} else if (a[midIndex] > x) {
			return binarySearchUsingRecursion(a, x, midIndex + 1, end);
		} else {
			return binarySearchUsingRecursion(a, x, start, end - 1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(binarySearchUsingRecursion(arr, key));
		
		sc.close();
	}

}
