package july8;

import java.util.*;

public class NGE {

    public static void nge(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (s.size() == 0) {
                res.add(-1);
            }
            
            else if (s.peek() > arr[i]) {
                res.add(s.peek());
            }
            else {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    res.add(-1);
                } else {
                    res.add(s.peek());
                }
            }
            s.push(arr[i]);
        }

        Collections.reverse(res);
        System.out.println("Next Greater to Right: " + res);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        nge(arr);
    }
}
