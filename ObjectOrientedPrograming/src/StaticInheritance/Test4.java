package StaticInheritance;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (inherits from Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

// Further derived class (inherits from Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class Test4 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.walk();
	}
}
