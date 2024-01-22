public class reverserray {
    public static void goreverse(int number[]) {
        int start=0;
        int end=number.length -1;
        while (start<end) {
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[]={9,7,5,4,3,0};
        goreverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
