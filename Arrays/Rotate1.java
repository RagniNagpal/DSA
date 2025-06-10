package Arrays;

public class Rotate1 {

    public void rotateBy1(int[] arr) {
        if (arr.length == 0) return;

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        Rotate1 obj = new Rotate1();
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i : arr) System.out.print(i + " ");

        obj.rotateBy1(arr);

        System.out.println("\nArray after 1 left rotation:");
        for (int i : arr) System.out.print(i + " ");
    }
}
