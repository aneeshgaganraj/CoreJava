package Operator;

public class Question12 {
	public static void main(String[] args) {
		int number =  101;
		int original = number;	
		int reverse = 0;
		while(number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		if(reverse == original) {
			System.out.println("Palindrome NUmber");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
