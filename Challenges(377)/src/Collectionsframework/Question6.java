package Collectionsframework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question6 {
	public static void main(String[] args) {
		String s = "RajaRamMohanRoy";
		s = s.toLowerCase();
		char x[] = s.toCharArray();
		int size = x.length;
		int i = 0;
		TreeMap <Character,Integer> Hm = new TreeMap<>();
		Hm.put('A', 2);
		while(i!= size) {
			if(!(Hm.containsKey(x[i]))) {
				Hm.put(x[i], 1);
			}
			else {
				int oldvalue = Hm.get(x[i]);
				int newvalue = oldvalue + 1;
				Hm.put(x[i], newvalue);
			}
			i++;
	}
		Set<Map.Entry<Character,Integer>> y = Hm.entrySet();
		for(Map.Entry<Character, Integer> data : y) {
			System.out.print(data.getValue() + " ");
			System.out.print(data.getKey());
			System.out.println();
		}
	}
}
