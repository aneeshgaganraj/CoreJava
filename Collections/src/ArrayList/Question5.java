package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
	String name;
	int runs;
	float avg;
	public Cricketer(String name, int runs, float avg) {
		super();
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Cricketer[name = "+name+",runs = "+runs+",average = " +avg + "]";
		
	}
}
class Alpha2 implements Comparator<Cricketer>{

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		// TODO Auto-generated method stub
		if(c1.avg > c2.avg) {
			return 1;
		}
		else if(c1.avg < c2.avg) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class Question5 {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("Sachin",200000,50);
		Cricketer c2 = new Cricketer("Virat",212000,78);
		Cricketer c3 = new Cricketer("Dhoni",2000,30);
		ArrayList<Cricketer> al = new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		Collections.sort(al,new Alpha2());
		System.out.println(al);
	}
}
