import java.util.*;
public class hallow {

public static void hallow_rectagle(int Row,int Colm) {
    for (int i =1; i <=Row; i++) {
        for (int j = 1; j <= Colm; j++) {
            if (i==1 || i==Row || j==1 || j==Colm) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        hallow_rectagle(4, 3);
    }
}
