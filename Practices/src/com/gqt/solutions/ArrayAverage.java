package com.gqt.solutions;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,5};
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
		}
		double Average = (sum)/arr.length;
		System.out.println(Average);
	}

}
