package com.gqt.solutions;

public class MaxElement {
	public static void main(String[] args) {
		int [] array = {1200,344,564,45,67,45,1200};
		int max = array[0];
		int index = 0;
		for(int i =1; i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
