package patterns2;

import java.util.Scanner;

//import java.util.*;s


public class InvertedTriangle {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		
		
		int n = scanner.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n-i+1) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
