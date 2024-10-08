
public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f = new Fan();
		f.rotate();
		f.Stop();
		f.Blow();
		System.out.println(f.NoofWings);
	}
}
class Fan{
	int NoofWings;
	String Color;
	int Coast;
	void rotate() {
		System.out.println("Rotating");
	}
	void Stop() {
		System.out.println("Stopped");
	}
	void Blow() {
		System.out.println("Air Blown");
	}
}
