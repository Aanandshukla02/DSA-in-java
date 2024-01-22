import java.util.*;
public class arrayinput {
    public static void main(String[] args) {
        int marks[]= new int[100];
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <=5; i++) {
            marks[i]=sc.nextInt();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("number is--->"+marks[i]);
        }
    }
}
