package Static;

import java.util.Scanner;

class Farmer{
	float Principle;
	float rate;
	float time;
	float simpleinterest;
	 void acceptInput() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the Principle Amount");
		 Principle = scan.nextFloat();
		 System.out.println("Enter the time");
		 time = scan.nextFloat();
		 rate = 2.5f;
	 }
	 void cal() {
		 simpleinterest = (Principle * time * rate)/100;
	 }
	 void Display() {
		 System.out.println("Total Amount is: " + simpleinterest);
	 }
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f = new Farmer();
		f.acceptInput();
		f.cal();
		f.Display();
		
		Farmer f1 = new Farmer();
		f1.acceptInput();
		f1.cal();
		f1.Display();
		Farmer f2 = new Farmer();
		f2.acceptInput();
		f2.cal();
		f2.Display();
		
	}

}
