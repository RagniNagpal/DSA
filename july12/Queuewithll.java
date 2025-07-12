package july12;

public class Queuewithll {

  // Static Node class
  static class Node {
    int val;
    Node next;

    Node(int data) {
      val = data;
      next = null;
    }
  }

  static class MyQueue {
    Node front = null;
    Node rear = null;

    // Enqueue (add to rear)
    void enqueue(int x) {
      Node temp = new Node(x);
      if (rear == null) {
        front = rear = temp;
        return;
      }
      rear.next = temp;
      rear = temp;
    }

    // Dequeue (remove from front)
    int dequeue() {
      if (front == null) {
        System.out.println("Queue Underflow");
        return -1;
      }
      int val = front.val;
      front = front.next;

      // If queue becomes empty
      if (front == null)
        rear = null;

      return val;
    }

    // Peek (front element)
    int peek() {
      if (front == null) {
        System.out.println("Queue is Empty");
        return -1;
      }
      return front.val;
    }

    // Check if empty
    boolean isEmpty() {
      return front == null;
    }
  }

  public static void main(String[] args) {
    MyQueue q = new MyQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println(q.peek());    // 10
    System.out.println(q.dequeue()); // 10
    System.out.println(q.peek());    // 20
    System.out.println(q.isEmpty()); // false
    q.dequeue();
    q.dequeue();
    System.out.println(q.isEmpty()); // true
  }
}
