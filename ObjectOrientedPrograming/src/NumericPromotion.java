class Addition1{
	float add(int x, float y) {
		return x+y;
	}
	float add(float x, int y) {
		return x+y;
	}
}
public class NumericPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 add = new Addition1();
		//System.out.println(add.add(10.5, 10));//here i have passed int value for float
		//error at sysout as complier is confused which method to call due to type csesting
	}
}
