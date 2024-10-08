package StaticInheritance;
class Example{
	int a,b;
	Example(){
		super();
		a = 20;
		b = 30;
	}
	Example(int a , int b){
		super();
		this.a = a;
		this.b = b;
	}
}
class Example3 extends Example{
	int c,d;
	Example3(){
		super();
		c=11;
		d=12;
	}
	Example3(int c, int d){
		super();
		this.c = c;
		this.d = d;
	}
	void Display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Main {
	public static void main(String[] args) {
		Example3 x = new Example3(10,20);
		x.Display();
	}
}
