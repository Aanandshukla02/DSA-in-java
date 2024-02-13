public class linearsearch {
    // Function to perform linear search on an array
    public static int search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found in the array
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 14, 16, 18};
        int key = 100;

        // Perform linear search and store the result
        int res = search(number, key);

        // Check the result and print appropriate message
        if (res == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index: " + res);
        }
    }
}
