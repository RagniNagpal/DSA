package july13;

import java.util.Stack;

public class MinStack {

  static class MyMinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MyMinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
    }

    public void push(int val) {
      stack.push(val);

      // If minStack is empty or val is <= current min, push to minStack
      if (minStack.isEmpty() || val <= minStack.peek()) {
        minStack.push(val);
      }
    }

    public void pop() {
      if (stack.isEmpty()) return;

      int removed = stack.pop();
      if (removed == minStack.peek()) {
        minStack.pop();
      }
    }

    public int top() {
      if (stack.isEmpty()) return -1;
      return stack.peek();
    }

    public int getMin() {
      if (minStack.isEmpty()) return -1;
      return minStack.peek();
    }
  }

  public static void main(String[] args) {
    MyMinStack minStack = new MyMinStack();
    minStack.push(5);
    minStack.push(3);
    minStack.push(7);
    System.out.println(minStack.getMin()); // 3
    minStack.pop();
    System.out.println(minStack.getMin()); // 3
    minStack.pop();
    System.out.println(minStack.getMin()); // 5
  }
}
