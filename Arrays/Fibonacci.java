package Arrays;

public class Fibonacci {
    
    public void generateFibonacci(int n) {
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int n = 10; 
        fib.generateFibonacci(n);
    }
}
