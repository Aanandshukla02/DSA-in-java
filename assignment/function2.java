import java.util.*;
public class function2 {
    public static boolean isEven(int num) {
        if (num%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
