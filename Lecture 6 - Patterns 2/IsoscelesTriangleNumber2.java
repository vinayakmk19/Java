/*
 
 
	 Code : Triangle of Numbers
		Send Feedback
		Print the following pattern for the given number of rows.
		Pattern for N = 4
		
		
		
		The dots represent spaces.
		
		
		
		Input format :
		Integer N (Total no. of rows)
		Output format :
		Pattern in N lines
		Constraints :
		0 <= N <= 50
		Sample Input 1:
		5
		Sample Output 1:
		           1
		         232
		       34543
		     4567654
		   567898765
		Sample Input 2:
		4
		Sample Output 2:
		           1
		         232
		       34543
		     4567654
 
 
 */

package patterns2;

import java.util.*;

public class IsoscelesTriangleNumber2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		
		int i = 1;
		while(i <= n) {
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			
			int p = i;
			int numbers = 1;
			while(numbers <= i) {
				System.out.print(p);
				numbers = numbers + 1;
				p = p + 1;
				
				
			}
			
			int dec = i*2-2;
			while(dec >= i) {
				System.out.print(dec);
				dec = dec - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
