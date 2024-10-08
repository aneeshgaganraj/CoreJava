class Dog4{
	private String name;
	private String color;
	private int cost;
	
	Dog4(String name, String color){
		this();
		this.name =name;
		this.cost = cost;
	}
	Dog4(){
		super();
		name = "leo";
		color = "dark";
		cost = 12231;
	}
	void Display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}
public class Usingthis {
	public static void main(String[] args) {
		Dog4 d = new Dog4();
		d.Display();
		Dog4 d1 = new Dog4("Charlie","White");
		d1.Display();
	}
}
