package recursion1;

import java.util.Scanner;

public class IsArraySorted {

	public static boolean isArraySorted(int a[]) {
		if (a.length == 1) {
			return true;
		}

		if (a[0] > a[1]) {
			return false;
		}

		int smallArray[] = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			smallArray[i - 1] = a[i];
		}

		boolean isSmallArraySorted = isArraySorted(smallArray);
		return isSmallArraySorted;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println(isArraySorted(array));
	}

}
