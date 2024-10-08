import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter the Number  "  );
		int num = scan.nextInt();
		System.out.println(num);
		int count = 0;
		if(num > 1) {
			for(int i = 1; i <= num;i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Its a Prime Number");
			}
			else {
				System.out.println("Not a Prime Number");
			}
		}
		else if(num == 1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Please enter Positive Number");
		}
	}
}
