package com.gqt.solutions;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] arr= {1,7,11,8,9};
		System.out.println(Arrays.toString(arr));
		int length = arr.length;
		for(int i = 0; i < length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[length - 1- i];
			arr[length - 1- i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < length / 2; i++) {
			System.out.println(i);
		}
	}
}
