
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =  new String("Sachin");
		String s2 = new String("SachinTendulkar");
		if(s1.equals(s2)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}
		if(s1==s2) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are Unequal");
		}
	}
}
