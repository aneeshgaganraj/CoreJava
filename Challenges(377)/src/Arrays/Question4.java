package Arrays;

import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		int [] arr = {1,2,2,3,3,4,4,5,5,6};
		int [] temp = new int[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length-1 ;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[arr.length -1];//to allow the copy of last element in array
		System.out.println(Arrays.toString(temp));
		System.out.println(j);
		int [] result = new int[j];
		for(int i = 0; i < j; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
