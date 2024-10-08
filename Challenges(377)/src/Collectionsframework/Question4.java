package Collectionsframework;

import java.util.Iterator;
import java.util.TreeSet;

public class Question4 {
	public static void main(String[] args) {
		TreeSet <Integer> ts  = new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.remove(1);
		Iterator <Integer> itr =  ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
