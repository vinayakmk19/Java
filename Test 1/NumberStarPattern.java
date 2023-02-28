/*
	 				***** Number Star pattern 1*****
	Print the following pattern for given number of rows.
	Input format :
	Integer N (Total number of rows)
	Output Format :
	Pattern in N lines
	Sample Input :
	   5
	Sample Output :
	 5432*
	 543*1
	 54*21
	 5*321
	 *4321
 */


package test1;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(n-j);
            }
            System.out.print("*");
            
            for(int j=1; j<i; j++){
                System.out.print(i-j);
            }
            System.out.println();
        }
	}

}
