
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin";
		String s1 = "Sachin";
		String s2 = new String("Sachin");
		if(s.equals(s1)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}
		if(s1==s2) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Not");
		}
	}
}
