public class sorting {
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j]>=arr[j-1]) {
                    // swap  arr[j] and arr[j-1]
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int [ ] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max_element=arr[i];
            int max_index=i;
            for (int j = i+1; j < arr.length; j++ ) {
                if (max_element<arr[j]) {
                    max_element=arr[j];
                    max_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max_index];
            arr[max_index]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,8,7,4,5,1};
        print(arr);
        // bubblesort(arr);
        selectionsort(arr);
        print(arr);
    }
}
