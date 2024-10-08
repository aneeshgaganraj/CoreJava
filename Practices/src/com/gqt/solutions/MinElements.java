package com.gqt.solutions;

public class MinElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {122,344,56,45,67};
		int min = array[0];
		int index =  0;
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		System.out.println(min);
		System.out.println(index);
	}
	

}
