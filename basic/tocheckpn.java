import java.util.*;
public class tocheckpn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number -->");
        int n = s.nextInt();
        if (n>=0) {
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
}
}