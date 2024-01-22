
public class linearsearch {

    public static int search(int number[],int key) {
        for (int i = 0; i <number.length; i++) {
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,14,16,18};
        int key=100;
        int res=search(number, key);
            if (res==-1) {
                System.out.println("Not found");
            }else{
                System.out.println(res);
            }
    }
}