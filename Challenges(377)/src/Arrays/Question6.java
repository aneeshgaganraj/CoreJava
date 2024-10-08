package Arrays;

import java.util.Arrays;

public class Question6 {
	public static void main(String[] args) {
		int arr[] = {23,4,5,9,1};
		System.out.println(Arrays.toString(arr));for(int i = 0; i < arr.length-1;i++) {
			for(int j = 0 ; j <arr.length - 1-i;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Ascending order: " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1;i++) {
			for(int j = 0 ; j <arr.length - 1-i;j++) {
				if(arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println( "Descending order: " + Arrays.toString(arr));
	}
}
