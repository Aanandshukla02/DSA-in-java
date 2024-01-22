import java.util.*;

public class addtax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of 1 item:");
        float a = s.nextFloat();
        System.out.print("Enter the amount of 2 item:");
        float b = s.nextFloat();
        System.out.print("Enter the amount of 3 item:");
        float c = s.nextFloat();
        //Calculate total cost with 18% taxes
        float total=a+b+c;
        float tax=(total*0.18f)+total;
        System.out.println(tax);
        

    }
}
