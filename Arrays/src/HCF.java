
public class HCF {
	public static void main(String[] args) {
		System.out.println(HCF(12,15));
	}
	public static int HCF(int a, int b) {
		int smaller;
		int hcf = 0;
		if(a > b) {
			smaller = a;
		}
		else {
			smaller = b;
		}
		for(int i = 1; i <= smaller; i++) {
			if(i % a == 0 && i % b == 0) {
				hcf = i;
			}
			return hcf;
		}
		return -1;
	}
}
