package StaticInheritance;
class Demo11{
	int a = 10;
	private int b = 20;
}
class Demo2 extends Demo11{
	int b = 100;
	//Private variables cannot be accessed
}
class Demo3 extends Demo2{
	void Display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Demo3 d3 = new Demo3();
		d3.Display();
	}
}
