package com.gqt.solutions;

public class SortedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,31,4,5};
		boolean issorted = true;
		for(int i =1; i < arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				issorted = false;
				break;
			}
		}
		if(issorted) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not");
		}
	}
}
