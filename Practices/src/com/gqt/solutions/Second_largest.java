package com.gqt.solutions;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,2,8,6,77};
		int firstmax = 0;
		int secondmax = Integer.MIN_VALUE;
		for(int value : array) {
			if(value > firstmax) {
				secondmax = firstmax;
				firstmax = value;
			}
			else if(value > secondmax && value != firstmax) {
				secondmax = value;
			}
		}
		System.out.println(secondmax);
	}

}
