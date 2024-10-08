package StaticInheritance;
class Example1{
	int a,b;
	Example1(){
		super();
		a= 11;
		b =12;
	}
}
class Example2 extends Example1{
	int c,d;
	Example2(){
		super();
		c= 13;
		d = 15;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Constructors {
	public static void main(String[] args) {
		Example2 x = new Example2();
		x.display();
	}
}
