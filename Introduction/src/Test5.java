import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(num);
		long factorial = 1;
		for(int i = num; i > 0; i--) {
			factorial *=  i;
		}
		System.out.println("The Factorial is " + factorial);
	}
}
