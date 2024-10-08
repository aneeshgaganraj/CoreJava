package Operator;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Selece 1 to perform Additiom");
		System.out.println("Select 2 to perform Subtraction");
		System.out.println("Select 3 for multiplication");
		System.out.println("Select 4 for Division");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		int a;
		int b;
		int c;
		switch(choice){
		case 1:
			System.out.println("Enter the numbers");
			a = scan.nextInt();
			b = scan.nextInt();
			c = a +b;
			System.out.println(c);
			break;
		case 2:
			System.out.println("Enter the numbers");
			a = scan.nextInt();
			b = scan.nextInt();
			c = a - b;
			System.out.println(c);
			break;
		case 3:
			System.out.println("Enter the numbers");
			a = scan.nextInt();
			b = scan.nextInt();
			c = a * b;
			System.out.println(c);
			break;
		case 4:
			System.out.println("Enter the numbers");
			a = scan.nextInt();
			b = scan.nextInt();
			c = a / b;
			System.out.println(c);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
