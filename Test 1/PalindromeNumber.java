/*
 								***** Palindrome number *****
	Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
	Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
	Sample Input 1 :
	121
	Sample Output 1 :
	true
	Sample Input 2 :
	1032
	Sample Output 2 :
	false
 */

package test1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int temp = n;
		int rev =0;
		int rem;
		
		while(n >0) {
			rem = n %10;
			rev = rev*10+rem;
			n = n / 10;
		}
		
		if(temp == rev) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
