import java.util.Scanner;

class Demo1{
	void fun1() {
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection Terminated");
	}
}
class Demo2{
	void fun2() {
		Demo1 d1 = new Demo1();
		d1.fun1();
	}
}
class Demo3{
	void fun3() {
		try {
			Demo2 d2 = new Demo2();
			d2.fun2();
		}
		catch(Exception e) {
			System.out.println("Enter non zero");
		}
	}
}
public class Test5 {
	public static void main(String[] args) {
		Demo3 d3 = new Demo3();
		d3.fun3();
	}
}
