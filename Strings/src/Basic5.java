
public class Basic5 {
	public static void main(String[] args) {
		String s = "Sachin";
		String s1 = new String("Sachin");
		String s2 = new String("Ramesh");
		s1.concat("Tendulkar");
		String s3 = s1.concat("Tendulkar");
		String s4 = s3.concat("Tendulkar");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s2);
		System.out.println(s1);
		String snew = "Sachin";
		String snew1 = "Tendulkars";
		String snew3 = "SachinTendulkars";
		String snew2 = snew + snew1;
		System.out.println(snew2);
		System.out.println(snew3);
		System.out.println(snew2.equals(snew3));
		System.out.println(snew2==snew3);
	}
}
