package Static;
class Demo3{
	int x = 100,y=200,z= 300;
	static int a = 10, b=20,c=30;
	{
		System.out.println("Non-static Block1");
	}
	{
		System.out.println("Non Static Block2");
	}
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}
	Demo3(){
		System.out.println("Default Constructor");
	}
	static void  display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void Display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Test6 {
		public static void main(String[] args) {
			Demo3 d1 = new Demo3();
			d1.Display();
			Demo3.display();
		}
}
