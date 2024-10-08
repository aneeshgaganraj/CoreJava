
public class Changable {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Sachin");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("is a great batsman");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("He is from India");
		System.out.println(sb);
		System.out.println(sb.capacity());
		fun(10);
		fun(10,20);
		fun(30,40,50,60);
	}
	static void fun(int...x) {
		for(int i : x) {
			System.out.println(i);
		}
	}
}
