package functionsandscope;

import java.util.*;

public class CheckPrime {

	public static boolean checkPrime(int n) {
		int div = 2;
		while (div <= n / 2) {
			if (n % div == 0) {
				return false;
			}
			div = div + 2;
		}
		return true;
	}

	public static boolean checkPrime2(int n) {
		int div = 2;
		boolean isPrime = true;
		while (div <= n / 2) {
			if (n % div == 0) {
				isPrime = false;
				break;
			}
			div = div + 2;
		}
		return isPrime;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime = checkPrime(n);
		boolean isPrime2 = checkPrime2(n);
		System.out.println(isPrime);
		System.out.println(isPrime2);

	}

}
