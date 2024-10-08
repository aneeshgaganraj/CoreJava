package Arrays;

import java.util.Arrays;

public class Question24 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int k  =2;
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
		System.out.println(arr[arr.length - k]);
	}
}
