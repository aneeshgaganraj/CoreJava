package DataTypes;

public class Question13 {
	public static void main(String[] args) {
		String str = "Hello Aneesh How are you are you fine !";
		String subs = str.substring(10);
		int indexof = str.indexOf("you");
		boolean equalcheck = str.equals("Hello Aneesh How are you are you fine !");
		System.out.println(str);
		System.out.println("Substring: " + subs);
		System.out.println("Index of the word you is: " + indexof);
		if(equalcheck) {
			System.out.println("The string above is equal");
		}
		else {
			System.out.println("they are not same");
		}
	}
}
