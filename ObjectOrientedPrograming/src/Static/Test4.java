package Static;
class Demo12{
	int x = 100, y= 200, z = 300;
	{
		System.out.println("Non - Static Block");
	}
	public Demo12(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Parametrized Constructor");
	}
	public Demo12() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	void Display() {
		System.out.println("Non - Static Method");
	}
}
public class Test4 {
	public static void main(String[] args) {
		//System.out.println("Hello");
		Demo12 d = new Demo12();
		d.Display();
		Demo12 d1 = new Demo12();
		d1.Display();
	}
}
