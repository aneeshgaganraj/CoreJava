class Addition{
	double add(double d, double e) {
		return d+e;
	}
	int add(int num1, int num2) {
		return num1+num2;
	}
	float add(int num1, float num2) {
		return num1+num2;
	}
	float add(float num1, int num2) {
		return num1+num2;
	}
}
//for method overloading to occur the methods should never have the parameters in same order the return type
//doesnot matter

public class Overloadings {
	public static void main(String[] args) {
		Addition add = new Addition();
		float f = 2f;
		System.out.println(add.add(2.9, f));
	}
}
