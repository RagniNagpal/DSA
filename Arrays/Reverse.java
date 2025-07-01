package Arrays;

public class Reverse {
    public void reverse(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i : arr) System.out.print(i + " ");

        obj.reverse(arr);

        System.out.println("\nReversed array:");
        for (int i : arr) System.out.print(i + " ");
    }
}
