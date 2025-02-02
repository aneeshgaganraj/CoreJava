package DataTypes;
import java.math.BigInteger;
import java.util.Scanner;
public class Question19 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to calculate factorial
        BigInteger factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
	}
	public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE; // Initialize result to 1
        
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // Multiply result by i
        }
        return result;
    }
}
