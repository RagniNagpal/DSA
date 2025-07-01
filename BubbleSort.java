// BubbleSort.java recursive
package July1;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        bubbleSortRecursive(arr, arr.length);
    }

    private static void bubbleSortRecursive(int[] arr, int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSortRecursive(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}
