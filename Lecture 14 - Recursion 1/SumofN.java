package recursion1;

import java.util.Scanner;

public class SumofN {
	public static int sumn(int n) {
		if (n == 0) {
			return 0;
		}

		int smallOutput = sumn(n - 1);
		int output = n + smallOutput;
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumn(n));
		sc.close();
	}

}
