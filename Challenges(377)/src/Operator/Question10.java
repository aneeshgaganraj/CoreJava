package Operator;

public class Question10 {
	public static void main(String[] args) {
		int num = 10;
		int num1 = 20;
		int num2 = 30;
		if(num1 > num2 & num < num1) {
			System.out.println(num1 + " is the highest");
		}
		else if(num > num2 & num > num1) {
			System.out.println(num + " is the highest");
		}
		else {
			System.out.println(num2 + " is the largest");
		}
	}
}
