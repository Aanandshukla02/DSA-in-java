import java.util.*;
public class product {

    public static int mul(int x,int b) {
        int product=x*b;
       return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product =mul(a, b);
        System.out.println(product);
    }
}