@FunctionalInterface
interface Vla{
	int add (int a, int b);
}
public class Test3 {
	public static void main(String[] args) {
		Vla v = (int a, int b) -> { return a +b;
		};
		System.out.println(v.add(10, 20));
		}
	}

