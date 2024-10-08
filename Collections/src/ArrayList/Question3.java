package ArrayList;

import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(200);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.add(3,100);
		System.out.println(al);
	}
}
