package fundamentals;

import java.util.Scanner;

public class FahranheitToCelsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int d = sc.nextInt();
//		int celsius = 0;
		System.out.println("Fahranheit"+" "+"Celsius0");
		
		while(S <= E) {
			int celsius = (S - 32) * 5/9;
			System.out.println(S + " | " + celsius);
			S = S + d;
			
		}
	}
}
