public class largestinarray {
    public static int find(int number[]) {
        int Largest=Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (Largest<number[i]) {
                Largest=number[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int number[]={90,173,46,62,94};
        System.out.println("Largest value is -->"+find(number));
    }
}
