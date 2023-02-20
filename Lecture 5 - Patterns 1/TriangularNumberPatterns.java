package patterns;
import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class TriangularNumberPatterns {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(j);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		
	}
}
