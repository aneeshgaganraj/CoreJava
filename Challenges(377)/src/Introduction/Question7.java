package Introduction;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base and Height of the triangle");
		int base = scan.nextInt();
		int height = scan.nextInt();
		double area = 0.5 *  (base * height);
		System.out.println("Area of the Triangle is: " + area);
	}
}
