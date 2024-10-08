package Collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(true);
		al.add(20.34f);
		al.add("Aneesh");
		al.remove(3);
		Iterator <Integer> itr = al.iterator();
		System.out.println("Using Iterators");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
}
