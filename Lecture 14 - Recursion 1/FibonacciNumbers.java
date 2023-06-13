package recursion1;

import java.util.Scanner;

public class FibonacciNumbers {

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		int fib1 = fibonacci(n - 1);
		int fib2 = fibonacci(n - 2);

		int output = fib1 + fib2;
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fib = fibonacci(n);
		System.out.println(fib);
	}

}
