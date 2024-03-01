
public class PeakElementFinder {
    public static int findPeak(int arr[], int n)
	{
		// First or last element is peak element
		if (n == 1)
			return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;
		// Check for every other element
		for (int i = 1; i < n - 1; i++) {
			// Check if the neighbors are smaller
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}
	// Driver Code
	public static void main(String[] args)
	{
		int arr[] ={1,2,3};
		int n = arr.length;
		System.out.println("Index of a peak point is " + findPeak(arr, n));
	}
    
}