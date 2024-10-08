package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Question1 {
	public static void main(String[] args) {
		ArrayList e = new ArrayList();
		e.add(100);
		e.add("Aneesh");
		e.add(false);
		e.add(20.05f);
		System.out.println(e);
		System.out.println("Display Array List Elements");
		for(int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}
		System.out.println("Using Iterator");
		Iterator <Integer>  itr1 = e.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Using List Iterator");
		ListIterator <Integer>  itr11 = e.listIterator(e.size());
		while(itr11.hasPrevious()) {
			System.out.println(itr11.previous());
		}
	}
	}

