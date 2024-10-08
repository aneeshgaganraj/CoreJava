package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question7 {
	public static void main(String[] args) {
		 int [] arr = {1,2,3,4,5,2,3,1,5,3,1,2,6,2};
		int i = 0;
		LinkedHashMap< Integer,Integer> lhm  = new LinkedHashMap<>();
		while(i != arr.length) {
			if(!lhm.containsKey(arr[i])) {
				lhm.put( arr[i], 1);
			}
			else {
				int oldvalue = lhm.get(arr[i]);
				int newvalue = oldvalue + 1;
				lhm.put( arr[i], newvalue);
			}
			i++;
		}
		Set<Map.Entry<Integer,Integer>> y = lhm.entrySet();
		for(Map.Entry<Integer,Integer> data : y) {
			System.out.print(data.getKey() +  " = ");
			System.out.print(data.getValue() +  " ");
			System.out.println();
		}
	}
}
