import java.util.*;

// Define a class named 'function3'
public class function3 {

    // Define a static method named 'palindrome' that takes an integer parameter 'number'
    public static boolean palindrome(int number) {
        // Initialize variables to store the reverse and the original number
        int reverse = 0;
        int originalNumber = number;

        // Start a while loop to reverse the digits of the original number
        while (originalNumber != 0) {
            // Extract the last digit of the original number
            int remainder = originalNumber % 10;
            // Build the reverse number by shifting digits and adding the last digit
            reverse = reverse * 10 + remainder;
            // Remove the last digit from the original number
            originalNumber = originalNumber / 10;
        }

        // Check if the original number is equal to its reverse after the loop
        return (number == reverse);
    }

    // Define the main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter an integer and store it in the 'palin' variable
        int palin = sc.nextInt();

        // Check if the entered number is a palindrome using the 'palindrome' method
        if (palindrome(palin)) {
            // Print a message if the number is a palindrome
            System.out.println(palin + " " + "Number is a Palindrome");
        } else {
            // Print a message if the number is not a palindrome
            System.out.println(palin + " " + "Number is not a Palindrome");
        }
    }
}