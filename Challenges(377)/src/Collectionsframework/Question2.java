package Collectionsframework;

import java.util.LinkedList;
import java.util.ListIterator;

public class Question2 {
	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(10000);
		ll.add(1);
		ll.add(2);
		ll.remove(1);
		System.out.println(ll);
		ll.add(0,12);
		ListIterator <Integer> ltr = ll.listIterator(ll.size());
		while(ltr.hasPrevious() == true) {
			System.out.println(ltr.previous());
		}
	}
}
