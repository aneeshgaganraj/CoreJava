package DataTypes;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value in small letter");
		String ch = scan.next();
		System.out.println("The value in Lowercase is which u entered is: " + ch);
		String upperrcase =  ch.toUpperCase();
		System.out.println("Upper case: " + upperrcase);
	}
}
