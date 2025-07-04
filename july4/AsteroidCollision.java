package july4;

import java.util.*;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean alive = true;
            while (!stack.isEmpty() && curr < 0 && stack.peek() > 0) {
                if (stack.peek() < -curr) {
                    stack.pop(); 
                } else if (stack.peek() == -curr) {
                    stack.pop(); 
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.push(curr);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {5, 10, -5};
        int[] output = asteroidCollision(input);

        System.out.println("Final asteroid state: " + Arrays.toString(output));
       
    }
}
