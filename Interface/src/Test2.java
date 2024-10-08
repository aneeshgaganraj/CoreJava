@FunctionalInterface
interface Calc{
	void add();
}

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc mc = () -> {System.out.println("Addition");};
		mc.add();
		
	}

}
