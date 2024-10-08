package com.gqt.solutions;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int [] arr = {2,3,4,5};
		int sum = 0;
		for(int x: arr) {
			sum += x;
		}
		System.out.println("Sum of elements " +  sum);
	}
}
