package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Question4 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(100);
		al1.add(40);
		al1.add(30);
		al1.add(20);
		al1.add(10);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println(Collections.binarySearch(al1, 100));;
	}
}
