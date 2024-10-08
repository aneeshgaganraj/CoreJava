package ArrayList;

import java.util.ArrayList;

public class Question2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		int x = al.get(0);
		//Manual Boxing
		ArrayList<Integer> al1 = new ArrayList<>();
		int y = 100;
		al1.add(Integer.valueOf(y));
		Integer i = al1.get(0);
		y = i.intValue();
		System.out.println(y);
	}
}
