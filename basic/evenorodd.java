import java.util.*;;
public class evenorodd {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    int number=sc.nextInt();

    if(number%2==0){
        System.out.println("The given number is Even");
    }else{
        System.out.println("The given number is Odd");
    }
}
}