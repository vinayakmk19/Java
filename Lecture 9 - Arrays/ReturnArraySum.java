package arrays;

import java.util.*;
import java.io.*;

public class ReturnArraySum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().trim().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}
	
//	Write Your Code HERE....
	
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
	
		return sum;
	}
	
// till here

	public static void main(String[] args) throws IOException {

		int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int[] input = takeInput();
            System.out.println(sum(input));
            t -= 1;
        }
	}

}
