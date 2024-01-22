public class largestinarray {
    public static int largest(int number[]) {
        int start=Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (start<number[i]) {
                start=number[i];
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int number[]={100,20,300,403,502,160};
        System.out.println("Largest value is --> " + largest(number));
        
    }
}
