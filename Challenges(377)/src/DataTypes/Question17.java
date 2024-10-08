package DataTypes;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a letter: ");
	        char letter = scanner.next().charAt(0);
	     if (letter >= 'a' && letter <= 'z') {
	            letter = (char) (letter - 'a' + 'A');  // Convert to uppercase
	        }
	        // Check if the letter is uppercase (ASCII: 'A' to 'Z')
	        else if (letter >= 'A' && letter <= 'Z') {
	            letter = (char) (letter - 'A' + 'a');  // Convert to lowercase
	        } else {
	            System.out.println("Invalid input! Please enter a letter.");
	            scanner.close();
	            return;
	        }
	     System.out.println("Converted letter: " + letter);
	        scanner.close();
	}
}
