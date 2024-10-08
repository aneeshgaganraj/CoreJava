package StaticInheritance;
class Demo{
	int a = 10;
	int b = 20;
}
class Demo1 extends Demo{
	void Display() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.Display();
	}
}
