package Arrays;

public class Search {

    public int searchElement(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Search obj = new Search();  

        int[] array = {10, 20, 30, 40, 50};  
        int key = 30; 

        int result = obj.searchElement(array, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
