package Collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class Question3 {
	public static void main(String[] args) {
		HashSet <Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.remove(1);
		Iterator <Integer> ltr = hs.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}
}
