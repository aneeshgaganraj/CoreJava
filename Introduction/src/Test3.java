
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		System.out.println("Before Swap " + a + " " + b );
		 a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Value of a After");
		System.out.println(b);
	}

}
