package StaticInheritance;
class Demo1111{
	int a,b;
	Demo1111(){
		super();
		a = 10;
		b = 20;
	}
	Demo1111(int a, int b){
		this.a = a;
		this.b = b;
	}
}
class Demo2111 extends Demo1111{
	int c,d;
	Demo2111(){
		c = 30;
		d =40;
	}
	Demo2111(int c,int d){
		super(300,400);
		this.a = a;
		this.b = b;
	}
	void Display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Test5 {
	public static void main(String[] args) {
		Demo2111 x = new Demo2111(100,200);
		x.Display();
	}
}
