package Operator;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius");
		int radius = scan.nextInt();
		float area = (float) (3.14 * radius*radius);
		System.out.println(area);
	}
}
