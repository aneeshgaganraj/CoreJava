
public class Basic2 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1.coast);
		System.out.println(d1.name);
		d1.bark();
		d1.Eat();
		d1.Sleep();
	}

}

class Dog{
	String name;
	String color;
	int coast;
	void bark() {
		System.out.println("Barking");
	}
	void Eat() {
		System.out.println("Eating");
	}
	void Sleep() {
		System.out.println("Sleeping");
	}
}