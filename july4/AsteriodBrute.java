package july4;

import java.util.Arrays;

public class AsteriodBrute {
    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int[] res = new int[n];     
        int resIndex = 0;           

        for (int i = 0; i < n;  i++) {
            int curr = asteroids[i];

            while (resIndex > 0 && curr < 0 && res[resIndex - 1] > 0) {
                int top = res[resIndex - 1];

                if (top < -curr) {
                    resIndex--;
                } else if (top == -curr) {
                    resIndex--;
                    curr = 0; 
                    break;
                } else {
                    curr = 0;
                    break;
                }
            }

          
            if (curr != 0) {
                res[resIndex++] = curr;
            }
        }

        return Arrays.copyOf(res, resIndex); 
    }

    public static void main(String[] args) {
        int[] input = {5, 10, -5};
        int[] output = asteroidCollision(input);
        System.out.println("Final State: " + Arrays.toString(output));
        
    }
}
