import java.util.*;
public class array1 {
    public static boolean check(int[] check) {
        for (int i = 0; i < check.length; i++) {
            for (int j = i+1; j < check.length; j++) {
                if (check[i]==check[j]) {
                    return true;
                }
            }
        }
        return false;
        
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4};
    System.out.println(check(arr));   
}  
}