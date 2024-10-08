package Introduction;
import java.util.Scanner;
public class Question25 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Asking the user for the base and the exponent
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        // Process: Calculating the power using Math.pow()
        double result = Math.pow(base, exponent);
        
        // Output: Displaying the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        scanner.close();
    }
}


