interface claculator{
	int compare (int a, int b);
}
public class Test4 {
	public static void main(String[] args) {
		claculator c = (int a, int b) -> { return (a > b) ? 1: (a < b) ? -1: 0;
		};
		int result = c.compare(10,20);
		System.out.println(result);
		System.out.println((result == 1)? "a is more than b" : (result == -1) ? "b is more than a" : "both are equal");
	}
}

