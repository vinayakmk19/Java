package functionsandscope;

import java.util.Scanner;

public class NcR {

	public static int factorial(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int r = scanner.nextInt();

//		int factN = 1;
//		for (int i = 1; i <= n; i++) {
//			factN = factN * i;
//		}
//		int factR = 1;
//		for (int i = 1; i <= r; i++) {
//			factR = factR * i;
//		}
//		int factNR = 1;
//		for (int i = 1; i <= n - r; i++) {
//			factNR = factNR * i;
//		}

		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n - r);

		int result = factN / (factR * factNR);

		System.out.println(result);

	}

}
