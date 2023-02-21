package patterns2;

import java.util.*;


public class MirrorImageNumberPattern {

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
			System.out.println();
			i = i + 1;
		}
	}
}
