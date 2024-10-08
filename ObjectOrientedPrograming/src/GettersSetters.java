class DOG1{
	private String name;
	private int coast;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCoast() {
		return coast;
	}
	public void setCoast(int coast) {
		this.coast = coast;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
public class GettersSetters {
	public static void main(String[] args) {
		DOG1 d = new DOG1();
		d.setName("Charlie");
		d.setColor("White");
		d.setCoast(100000);
		System.out.println(d.getName());
		System.out.println(d.getCoast());
	}
}
