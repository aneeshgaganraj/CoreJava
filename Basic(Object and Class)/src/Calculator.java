import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Select 1 to perform Add");
		System.out.println("Select 2 to perform Subtraction");
		System.out.println("Select 3 to perform Multiplication");
		System.out.println("Select 4 to perform Division");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice = scan.nextInt();
		int a;
		int b;
		int c;
		switch(choice) {
		case 1: 
			System.out.println("Enter the Numbers");
		    a = scan.nextInt();
		    b = scan.nextInt();
		    c = a +b;
		    System.out.println(c);
		    break;
		case 2: 
			System.out.println("Enter the Numbers");
		    a = scan.nextInt();
		    b = scan.nextInt();
		    c = a -b;
		    System.out.println(c);
		    break;
		case 3: 
			System.out.println("Enter the Numbers");
		    a = scan.nextInt();
		    b = scan.nextInt();
		    c = a * b;
		    System.out.println(c);
		    break;
		case 4: 
			System.out.println("Enter the Numbers");
		    a = scan.nextInt();
		    b = scan.nextInt();
		    c = a / b;
		    System.out.println(c);
		    break;
		default: 
			System.out.println("Enter The Right Choice");
			break;
		}
	}
	}

