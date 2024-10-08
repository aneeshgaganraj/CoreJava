class DOG{
	private String name;
	private int coast;
	private String color;
	public DOG(String name, int coast, String color) {
		super();
		this.name = name;
		this.coast = coast;
		this.color = color;
	}
	void Display() {
		System.out.println(name);
		System.out.println(coast);
		System.out.println(color);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOG d = new DOG("Charlie",100000,"White");
		d.Display();
	}

}
