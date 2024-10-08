package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question3 {
	public static void main(String[] args) {
		String s = "RajaRamMohanRoy";
		s = s.toLowerCase();
		char x[] = s.toCharArray();
		int size = x.length;
		int i = 0;
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
		while(i!=size) {
			if(!(lhm.containsKey(x[i]))) {
				lhm.put(x[i], 1);
			}
			else {
				int oldvalue = lhm.get(x[i]);
				int newValue = oldvalue + 1;
				lhm.put(x[i], newValue);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>> y = lhm.entrySet();
		for(Map.Entry<Character,Integer> data : y) {
			if(data.getValue() == 1) {
				System.out.print(data.getKey() + " ");
				System.out.print(data.getValue() + " ");
				System.out.println();
			}
		}
	}
}
