package Introduction;

import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
		System.out.println("Enter the Radius of the Circle");
		Scanner scan = new Scanner(System.in);
		int radius =  scan.nextInt();
		float area = (3.142f * radius * radius);
		float perimeter = (2 * 3.142f * radius);
		System.out.println("The area of circle is " +  area);
		System.out.println("The permiter is " + perimeter);
	}
}
