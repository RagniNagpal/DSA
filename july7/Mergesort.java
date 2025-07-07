package july7;

public class Mergesort {

    //  Step to merge two sorted halves: conquer()
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];  // temp array for merged result
        int idx1 = si;     // pointer for left half
        int idx2 = mid + 1; // pointer for right half
        int x = 0;          // pointer for merged array

        //  Merge elements from both halves in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // If left half still has elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // If right half still has elements
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        //  Copy merged[] back into original arr[]
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    //Recursive division: divide()
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) return;  // base case

        int mid = si + (ei - si) / 2;  // to avoid overflow
        divide(arr, si, mid);          // left half
        divide(arr, mid + 1, ei);      // right half
        conquer(arr, si, mid, ei);     // merge sorted halves
    }

    // Main method to test
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
