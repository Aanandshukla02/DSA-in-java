import java.util.*;

public class AverageCalculator{
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int av=(a+b+c)/3;
        System.out.println("Average of "+a+" , " +b+" and "+c+" is :"+av);

    }
}