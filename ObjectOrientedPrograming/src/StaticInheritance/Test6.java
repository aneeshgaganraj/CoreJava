package StaticInheritance;
class Demo6{
	int a,b;
	Demo6(){
		this(300,400);
		System.out.println("Parent Default");
		a = 10;
		b = 20;
	}
	Demo6(int a, int b){
		System.out.println("Parent Parememeter constructor");
		this.a = a;
		this.b = b;
	}
}
class Demo61 extends Demo6{
	int c,d;
	Demo61(){
		System.out.println("Child-Default");
		c =67;
		d = 89;
	}
	Demo61(int c, int d){
		this();
		System.out.println("Child Para");
		this.c = c;
		this.d = d;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Test6 {
	public static void main(String[] args) {
		Demo61 d = new Demo61(100,300);
		d.display();
	}
}
