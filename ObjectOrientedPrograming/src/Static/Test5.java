package Static;
class Demo1{
	int x = 100, y =200, z = 300;
	static int a = 10, b =20, c = 30;
	{
		System.out.println("Non Static Block11");
	}
	{
		System.out.println("Non Static Block12");
	}
	static {
		System.out.println("Static Block1");
	}
	static {
		System.out.println("Static Block2");
	}
	Demo1(){
		super();
		System.out.println("Default Constructor");
	}
	static void Display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void Display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
public class Test5 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.Display1();
		Demo1.Display();
		Demo1 d11 = new Demo1();
		d11.Display1();
		Demo1.Display();
	}
}
