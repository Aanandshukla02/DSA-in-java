public class maxsubarraysum {
    public static void maxsubarray(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum--> " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        maxsubarray(number);
    }
}