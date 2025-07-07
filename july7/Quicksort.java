package july7;

public class Quicksort {

    // 🔹 Partition method (Lomuto partition scheme)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // pivot = last element
        int i = low - 1;         // pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // put pivot in the correct position (i+1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // return the pivot index
    }

    // 🔹 QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // left subarray
            quickSort(arr, low, pivotIndex - 1);

            // right subarray
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // 🔹 Main function to test
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
