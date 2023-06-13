/*
 									***** Check Armstrong *****
	
	Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
	An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
	For example,
	371, as 3^3 + 7^3 + 1^3 = 371
	1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
	Input Format :
	Integer n
	Output Format :
	true or false
	Sample Input 1 :
	1
	Sample Output 1 :
	true
	Sample Input 2 :
	103
	Sample Output 2 :
	false

 */

package group1set1;

import java.util.*;

public class CheckArmstrong {
	static boolean chechArmStrong(int n) {
		int num2 = n;
		int num = n;

		int rem = 0;
		int res = 0;
		int count = 0;

		while (num2 != 0) {
			num2 /= 10;
			++count;
		}

		while (n != 0) {
			rem = n % 10;
			res = res + (int) Math.pow(rem, count);
			n = n / 10;
		}

		if (num == res) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = chechArmStrong(n);
		System.out.println(result);
		sc.close();

	}

}
