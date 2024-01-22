public class linearsearch {
    public static int search(int number[],int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
        int key =8;
        int res =search(number, key);
        if (res==-1) {
            System.out.println("Not. found");
        }else{
            System.out.println(res);
        }
    }
    
}