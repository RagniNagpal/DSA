package july3;

import java.util.Arrays;
import java.util.Stack;

public class NgesToright {

  public static int[] gright(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];
    Stack<Integer> stack = new Stack<>();
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= arr[i]) {
        stack.pop();
      }
      ans[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(arr[i]);
    }
    return ans;
  }

  public static int[] countGreaterRight(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[i]) {
          count++;
        }
      }
      ans[i] = count;
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 5, 2, 10, 8 };

    int[] nge = gright(arr);
    System.out.println("Next greater element to the right: " + Arrays.toString(nge));

    int[] count = countGreaterRight(arr);
    System.out.println("Number of greater elements to the right: " + Arrays.toString(count));
  }
}
