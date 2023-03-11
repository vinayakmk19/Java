package arrays;

public class ArrayWithFunctions {
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void incrementArray(int arr[]) {
		arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]+1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		incrementArray(arr);
		printArray(arr);

		
	}

}
