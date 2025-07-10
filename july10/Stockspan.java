package july10;

import java.util.ArrayList;
import java.util.Stack;
class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Stockspan {
  public static void nge(int[] arr) {
        int n = arr.length;
        Stack<Pair> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (stack.size() == 0) {
                list.add(i + 1);
            } else if (stack.peek().first > arr[i]) {
                list.add(i - stack.peek().second);
            } else {
                while (stack.size() > 0 && stack.peek().first <= arr[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    list.add(i + 1);
                } else {
                    list.add(i - stack.peek().second);
                }
            }

            stack.push(new Pair(arr[i], i)); // push (price, index)
        }

        System.out.println("Stock Prices: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println("\nSpan Values: ");
        for (int val : list) System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        nge(arr);
    }
}