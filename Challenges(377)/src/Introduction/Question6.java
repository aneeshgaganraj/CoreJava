package Introduction;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		double r1,r2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  a,b,c values");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = (b*b) - (4*a*c);
		if(d == 0) {
			System.out.println("Roots are Equal");
			r1=r2 = -b/(2*a);
			System.out.println("Root 1 is: " + r1);
			System.out.println("Root 2 is: " + r2);
		}
		else if(d > 0) {
			System.out.println("Roots are real and distinct");
			r1 = (-b + Math.sqrt(d))/(2*a);
			r2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Root1 is: " + r1);
			System.out.println("Root2 is: " + r2);
		}
		else {
			System.out.println("Roots are distinct and imaginary");
			r1 =  -b /(2*a);
			r2 = Math.sqrt(-d)/(2*a);
			System.out.println("Root1 is: " + r1);
			System.out.println("Root2 is: " + r2);
		}
	}
}
