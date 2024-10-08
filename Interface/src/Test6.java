import java.util.Scanner;

class Demo{
	void fun() throws ArithmeticException {
		System.out.println("Connection Established");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println("Problem Solved");
			throw e;
		}
		finally {
			System.out.println("Connection Terminated");
		}
	}
}
public class Test6 {
	public static void main(String[] args) {
		System.out.println("Connect1");
		try {
			Demo d = new Demo();
			d.fun();
		}
		catch(Exception e) {
			System.out.println("Solved");
		}
		System.out.println("Connect1");
	}
}
