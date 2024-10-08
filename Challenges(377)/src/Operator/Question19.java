package Operator;

public class Question19 {
	public static void main(String[] args) {
		int year = 2024;
		String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? "Leap Year" : "Not Leap Year";
		System.out.println(result);
	}

}
