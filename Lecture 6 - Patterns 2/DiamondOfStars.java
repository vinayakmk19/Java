/*
 
 
	Code : Diamond of stars
	
	Print the following pattern for the given number of rows.
	Note: N is always odd.
	
	
	Pattern for N = 5
	
	
	
	The dots represent spaces.
	
	
	
	Input format :
	N (Total no. of rows and can only be odd)
	Output format :
	Pattern in N lines
	Constraints :
	1 <= N <= 49
	Sample Input 1:
	5
	Sample Output 1:
	  *
	 ***
	*****
	 ***
	  *
	Sample Input 2:
	3
	Sample Output 2:
	  *
	 ***
	  *
 
 
 */

package patterns2;

import java.util.*;

public class DiamondOfStars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while (i <= n/2+1) {

			int spaces = 1;
			while (spaces <= n - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}

			int stars = 1;
			while (stars <= i * 2 - 1) {
				System.out.print("*");
				stars = stars + 1;
			}

			System.out.println();
			i = i + 1;
		}
		
		int j = 1;
		while(j <= n-1) {
			int spaces = 1;
			while (spaces <= j) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			
			int stars = 1;
			while (stars <= (n - j)*2 - 1) {
				System.out.print("*");
				stars = stars + 1;
			}
			j = j+1;
			System.out.println();
		}
		
		
	}
}
