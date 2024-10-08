package StaticInheritance;
class Demo111{
	int a = 10;
}
class Demo22 extends Demo111{

}
class Demo33 extends Demo22{
	int a = 20;
	void display() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class Test3 {
	public static void main(String[] args) {
		Demo33 d = new Demo33();
		d.display();
	}
}
