@FunctionalInterface
interface calculator{
	void add();
}
class Mycalculator implements calculator{
	public void add() {
		System.out.println("Addition");
	}
}
public class Test1 {
	public static void main(String[] args) {
		calculator mc = new Mycalculator();
		mc.add();
	}
}
