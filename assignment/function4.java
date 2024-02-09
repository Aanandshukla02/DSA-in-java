// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Declaring a public class named function4
public class function4 {

    // Declaring the main method
    public static void main(String[] args) {
        
        // Creating a new Scanner object named 'sc' to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input an integer
        System.out.print("Input an integer: ");

        // Reading the integer input by the user and storing it in the variable 'digits'
        int digits = sc.nextInt();

        // Calling the sumDigits function with the input integer and printing the result
        System.out.println("The sum is " + sumDigits(digits));
    }

    // Declaring a static method named sumDigits that takes an integer parameter 'n' and returns an integer
    public static int sumDigits(int n) {
        
        // Declaring and initializing a variable 'sumOfDigits' to store the sum of digits
        int sumOfDigits = 0;

        // Starting a while loop that continues as long as 'n' is greater than 0
        while(n > 0) {

            // Calculating the last digit of 'n' using the modulo operator and storing it in 'lastDigit'
            int lastDigit = n % 10;

            // Adding the last digit to 'sumOfDigits'
            sumOfDigits += lastDigit;

            // Removing the last digit from 'n'
            n /= 10;
        }

        // Returning the sum of digits
        return sumOfDigits;
    }
}
