package july12;

public class Stackswithll {

  // Static nested Node class
  static class Node {
    int val;
    Node next;

    Node(int data) {
      val = data;
      next = null;
    }
  }

  static class MyStack {
    Node top = null;

    // Push operation
    void push(int x) {
      Node temp = new Node(x);
      temp.next = top;
      top = temp;
    }

    // Pop operation
    int pop() {
      if (top == null) {
        System.out.println("Stack Underflow");
        return -1;
      }
      int popped = top.val;
      top = top.next;
      return popped;
    }

    // Peek operation
    int peek() {
      if (top == null) {
        System.out.println("Stack is empty");
        return -1;
      }
      return top.val;
    }

    // Check if empty
    boolean isEmpty() {
      return top == null;
    }
  }

  public static void main(String[] args) {
    MyStack st = new MyStack();
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println(st.peek()); // 30
    System.out.println(st.pop());  // 30
    System.out.println(st.peek()); // 20
  }
}
