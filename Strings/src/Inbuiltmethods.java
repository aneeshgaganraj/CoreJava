
public class Inbuiltmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RajaRamMohan";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		char[] ch = s.toCharArray();
		System.out.println(ch.length);
		System.out.println(ch[5]);
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('h'));
		System.out.println(s.substring(3, 8));
		System.out.println(s.substring(4));
		String s1 = "  sachin  Tendulkar ";
		System.out.println(s1);
		System.out.println(s1.trim());
		String s2 = "Sachin Ramesh Tendulkar";
		System.out.println(s2);
		System.out.println(s2.replace(" ", ""));
	}
}
