package july12;

public class QueuewithArrays {
  public static void main(String[] args) {
    QueueArray q = new QueueArray();
    q.push(6);
    q.push(3);
    q.push(7);
    System.out.println(q.peek());  // Output: 6
    System.out.println(q.pop());   // Output: 6
  }
}

class QueueArray {
  int size = 1000;
  int[] arr = new int[size];  
  int front = 0;
  int rear = 0;

  void push(int x) {
    if (rear == size) {
      System.out.println("Queue Overflow");
      return;
    }
    arr[rear++] = x;
  }

  int pop() {
    if (front == rear) {
      System.out.println("Queue Underflow");
      return -1;
    }
    return arr[front++];
  }

  int peek() {
    if (front == rear) {
      System.out.println("Queue is Empty");
      return -1;
    }
    return arr[front];
  }
}
