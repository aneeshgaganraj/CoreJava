package com.gqt.solutions;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,2,5,6,1};
		int [] unique = Arrays.stream(arr).distinct().toArray();
		System.out.println("Arrays after removing Duplicates");
		for(int value : unique) {
			System.out.println(value + " ");
		}
	}
}
