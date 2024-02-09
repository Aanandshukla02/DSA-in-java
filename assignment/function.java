import java.util.*;
public class function {
    public static void average(int num) {
        num=num/3;
        System.out.println(num);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=a+b+c;
        average(total);
    }
}