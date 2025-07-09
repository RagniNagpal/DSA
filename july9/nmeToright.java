package july9;

import java.util.*;

public class nmeToright {

    public static void nsr(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result.add(-1);
            } else if (stack.peek() < arr[i]) {
                result.add(stack.peek());
            } else {
                while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }

        Collections.reverse(result); // Because we processed from right to left
        System.out.println("Nearest Smaller to Right: " + result);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        nsr(arr);
    }
}
