// Importing a package to use Scanner and other utilities
import java.util.*;

// Defining a class named "function2"
public class function2 {

    // Defining a function named "isEven" which takes an integer "num" as input
    public static boolean isEven(int num) {
        // Checking if the number is divisible by 2 without remainder
        if (num % 2 == 0) {
            // If the condition is true, returning true
            return true;
        }
        // If the condition is false, returning false
        return false;
    }

    // Main method where the program starts execution
    public static void main(String[] args) {
        // Creating a Scanner object named "sc" to take user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter an integer and storing it in variable "n"
        int n = sc.nextInt();
        
        // Calling the "isEven" function with input "n" and printing its result
        System.out.println(isEven(n));
    }
}
