package Operator;

public class Question5 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before Swap" + "X is: " + x + "Y is: " + y );
		 x = x ^ y;
		 y = x ^ y;
		 x = x ^ y;
		System.out.println("After Swap" + "X is: " + x + "Y is: " + y );
	}
}
