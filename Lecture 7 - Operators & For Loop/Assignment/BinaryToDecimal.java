/*
 * Binary to decimal
		Send Feedback
		Given a binary number as an integer N, convert it into decimal and print.
		Input format :
		An integer N in the Binary Format
		Output format :
		Corresponding Decimal number (as integer)
		Constraints :
		0 <= N <= 10^9
		Sample Input 1 :
		1100
		Sample Output 1 :
		12
		Sample Input 2 :
		111
		Sample Output 2 :
		7
 */


package Assignment;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int result = 0;
		int base = 1;
		
		while(temp != 0) {
			int rem = temp % 10;
			result = result+rem*base;
			temp = temp/10;
			base = base*2;
		}
		System.out.println(result);
	}

}
