package Static;
class Dog{
	String name;
	String color;
	int cost;
	static int count;
	public Dog(String name, String color, int cost) {
		super();
		count++;
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	public Dog() {
		super();
		count++;
		// TODO Auto-generated constructor stub
	}
	
}
public class Countobjects {
	public static void main(String[] args) {
		System.out.println(Dog.count);
		Dog d = new Dog();
		System.out.println(Dog.count);
		Dog d1 = new Dog();
		System.out.println(Dog.count);
		Dog d2 = new Dog("Leo","White",1234444);
		System.out.println(Dog.count);
		Dog d3 = new Dog("Leo","White",1234444);
		System.out.println(Dog.count);
		
	}
}
