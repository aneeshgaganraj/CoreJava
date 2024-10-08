package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Question1 {
	public static void main(String[] args) {
		HashSet<Integer> ts = new HashSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
		System.out.println(lhs);
	}
}
