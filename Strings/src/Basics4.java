
public class Basics4 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Sachin");
		StringBuffer sb2 = new StringBuffer("Sachin");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
		String s = "Sachin";
		String s1 = "Sachin";
		System.out.println(s.equals(s1));
		Dog d = new Dog();
		System.out.println(d.toString());
		Dog1 d1 = new Dog1();
		System.out.println(d1.toString());


	}
	
}
class Dog{
	int coast = 10000;
	String name = "Charlie";
	@Override
	public String toString() {
		return name+ " " + coast;
	}
}
class Dog1{
	int coast = 10000;
	String name = "Charlie";
}