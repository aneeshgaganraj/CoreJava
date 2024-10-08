package DataTypes;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you wish to do");
		String binary = "";
		int num = scan.nextInt();
		if(num == 0) {
			binary = "0";
		}
		while(num > 0) {
			binary = (num % 2) + binary;
			num = num/2;
		}
		System.out.println("Binay Representation is: " + binary);
	}
}
