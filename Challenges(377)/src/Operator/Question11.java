package Operator;

public class Question11 {
	public static void main(String[] args) {
		int num = 23498;
		int sum =0;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
