package patterns;
import java.util.*;

public class NumberPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = n;
		while(i >= 1) {
			int j = n;
			while(j >= 1) {
				System.out.print(j);
				j=j-1;
			}
			System.out.println();
			i = i-1;
		}
	}

}
