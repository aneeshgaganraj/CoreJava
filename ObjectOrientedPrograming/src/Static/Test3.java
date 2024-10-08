package Static;
class Demo{
	static int a = 10 , b = 20, c = 30;
	int x = 100, y = 200, z = 300;
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
public class Test3 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.display1();
		
	}
}
