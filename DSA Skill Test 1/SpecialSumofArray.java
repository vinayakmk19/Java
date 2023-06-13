
/*
 								***** Special Sum of array *****

	Given an array of length N, which contains single digit elements at every index. You need to find and return the sum of all elements of the array. But the final sum should also be single digit.
	In order to keep the output single digit - you need to keep adding the output number digits till single digit is left.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Output Format :
	Single digit sum
	Constraints :
	1 <= N <= 10^6
	Sample Input 1 :
	3
	9 9 9
	Sample Output 1 :
	9
	Sample Output Explanation :
	9 + 9 + 9 = 27
	2 + 7 = 9
	Hence, ans is 9.
	Sample Input 2 :
	5
	1 7 8 5 9
	Sample Output 1 :
	3
	Sample Output Explanation :
	1 + 7 + 8 + 5 + 9 = 30
	3 + 0 = 3
	Hence, ans is 3.


 */

package group1set1;

import java.util.Scanner;

public class SpecialSumofArray {

	public static int sum(int arr[]) {
		// Write code here
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum > 9) {

				int tempSum = 0;
				tempSum += sum % 10;
				sum /= 10;
				tempSum += sum;

				sum = tempSum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = sum(arr);
		System.out.println(result);
		sc.close();

	}

}
