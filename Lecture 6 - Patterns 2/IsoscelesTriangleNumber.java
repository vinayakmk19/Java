/*
 * Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 
 
 */

package patterns2;

import java.util.*;

public class IsoscelesTriangleNumber {

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
			
			int numbers = 1;
			while(numbers <= i) {
				System.out.print(numbers);
				numbers = numbers + 1;
			}
			
			int dec = i-1;
			while(dec >= 1) {
				System.out.print(dec);
				dec = dec - 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
