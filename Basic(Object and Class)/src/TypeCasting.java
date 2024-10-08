
public class TypeCasting {

	public static void main(String[] args) {
		byte a = 100;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		//Explicit Type Casting
		int a1 = 100;
		byte b1 = (byte) a1;
		System.out.println(a1);
		System.out.println(b1);
		byte bb = 126;
		System.out.println(bb);
		//Example
		byte cc = 100;
		byte dd = 101;
		int ee = cc + dd;
		System.out.println(cc + dd);
		System.out.println(ee);
		char ch = 'a';
		int ch1 = ch;
		int ch2 = 123;
		char cx = (char) ch2;
		System.out.println(cx);
		System.out.println(ch2);
	}
}
