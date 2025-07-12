package july12;

public class StackswithArrays {
  public static void main(String[] args) {
    StackArray st = new StackArray();
    st.push(6);
    st.push(3);
    st.push(7);
    System.out.println(st.peek()); 
    System.out.println(st.pop());  
  }
}

class StackArray {
  int size = 1000;
  int[] arr = new int[size];
  int top = -1;

  void push(int x) {
    if (top == size - 1) {
      System.out.println("Stack Overflow");
      return;
    }
    arr[++top] = x;
  }

  int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    }
    return arr[top--];
  }

  int peek() {
    if (top == -1) {
      System.out.println("Stack is Empty");
      return -1;
    }
    return arr[top];
  }
}
