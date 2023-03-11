package arrays;
import java.util.*;

//Taking Input and Printing array using functions

public class InputOfArray {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = takeInput();
		printArray(arr);
	}

}
