public class Basics3 {
	public static void main(String[] args) {
		String s1 = "Sachin";
		System.out.println(s1);
		s1.concat("Tendulkar");
		System.out.println(s1);
		String s2 = s1.concat("Tendulkar");
		System.out.println(s2);
		s1 = s1.concat("Tendulkar");
		System.out.println(s1);
		String s12 = "Sachin";
		String s22 =  new String("Sachin");
		System.out.println(s12.equals(s22));
		System.out.println(s12 == s22);
	}
}
