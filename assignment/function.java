// Importing a package to use Scanner and other utilities
import java.util.*;

// Defining a class named "function"
public class function {

    // Defining a method named "average" which takes an integer "num" as input
    public static void average(int num) {
        // Dividing the input number by 3
        num = num / 3;
        // Printing the result of the division
        System.out.println(num);
    }
    
    // Main method where the program starts execution
    public static void main(String[] args) {
        // Creating a Scanner object named "sc" to take user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter three integers and storing them in variables "a", "b", and "c"
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Calculating the total sum of the three integers
        int total = a + b + c;
        
        // Calling the "average" method with the total sum as input
        average(total);
    }
}
