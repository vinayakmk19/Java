package arrays;
import java.util.*;

//Taking Input and Printing array using functions

public class LargestEelement {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	// Your code goes here.....
	
	public static int printLargestElement(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	// end

	public static void main(String[] args) {

		int arr[] = takeInput();
		int largest = printLargestElement(arr);
		System.out.println(largest);
	}

}
