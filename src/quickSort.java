public class quickSort {
    int partition(int arr[], int low, int high)
    {
        // First element as pivot
        int pivot = arr[low];
        int st = low; // st points to the starting of array
        int end
                = high; // end points to the ending of the array
        int k = high;
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, k--);
        }
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    }

    // Function to swap two elements
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* The main function that implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    void QuickSort(int arr[], int low, int high)
    {
        // If low is lesser than high
        if (low < high) {
            // idx is index of pivot element which is at its
            // sorted position
            int idx = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            QuickSort(arr, low, idx - 1);
            QuickSort(arr, idx + 1, high);
        }
    }

    /* Function to print an array */
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver Code
    public static void main(String args[])
    {
        int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
        int n = arr.length;

        quickSort ob = new quickSort();
        ob.QuickSort(arr, 0, n - 1);

        System.out.println("Sorted array");
        ob.printArray(arr, n);
    }

}
