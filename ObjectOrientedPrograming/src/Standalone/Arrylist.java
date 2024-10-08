package Standalone;

import java.util.ArrayList;

class Dog{
	String name;
	String color;
	int cost;
	public Dog(String name, String color, int cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return name + ' ' + ' ' + color + ' ' + cost;
	}
}
public class Arrylist {
	public static void main(String[] args) {
		Dog d1 = new Dog("Charlie","White",10000);
		Dog d2 = new Dog("LEO","White",123000);
		ArrayList <Dog> al = new ArrayList<Dog>();	
		al.add(d2);
		al.add(d1);
		for(Dog x : al) {
			System.out.println(x);
		}
	}
}
