
public class Basic2 {
	public static void main(String[] args) {
		String s = new String("Sachin");
		String s1 =  new String("Saurav");
		System.out.println(s.compareTo(s1));
		String s3 = new String("Saurav");
		String s4 = new String("Sachin");
		System.out.println(s3.compareTo(s4));
		String s5 = new String("Sachin");
		String s6 = new String("Sachin");
		System.out.println(s5.compareTo(s6));
		String s7 = new String("Sachin");
		String s8 = new String("SachinTendulkar");
		System.out.println(s7.compareTo(s8));
		System.out.println(s8.compareTo(s7));

	}
}
