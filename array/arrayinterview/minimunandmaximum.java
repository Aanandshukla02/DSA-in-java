public class minimunandmaximum {
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for each pass
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for comparisons in each pass
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    int temp = arr[j]; // Swap if the current element is greater than the next
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={12, 34, 56, 78, 90};
        bubblesort(arr);
        System.out.println("The minimun number is --> "+arr[0]);
        System.out.println("The maximum number is --> "+arr[arr.length-1]);
    }
}