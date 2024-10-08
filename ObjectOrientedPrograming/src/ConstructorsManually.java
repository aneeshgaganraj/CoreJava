class Dog3{
	private String name;
	private String color;
	private int cost;
	
	Dog3(String name, String color, int cost){
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	Dog3(){
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
public class ConstructorsManually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d = new Dog3();
		d.Display();
		Dog3 d1 = new Dog3("Charlie","White",100000);
		d1.Display();
	}

}
