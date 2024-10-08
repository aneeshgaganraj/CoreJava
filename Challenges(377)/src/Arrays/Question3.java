package Arrays;

import java.util.Arrays;

public class Question3 {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		int destination[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			destination[i] = arr[i];
		}
		System.out.println("Coppied Array: " + Arrays.toString(destination));
	}
}
