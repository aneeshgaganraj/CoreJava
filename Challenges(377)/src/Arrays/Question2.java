package Arrays;

import java.util.Arrays;

public class Question2 {
	public static void main(String[] args) {
		int [] arr = {1,34,56,8,88,9};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println( Arrays.toString(arr));
		System.out.println("Least Value int the Array is: " + min + " Max Value int the Array is: " + max);
	}
}
