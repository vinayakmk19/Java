package patterns;
import java.util.*;

public class TriangularStarPatteren {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
//		int p = 1;
		
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
//				p = p + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
