package Maths;
import java.util.*;

// binary to octal
public class BtoO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // example: 1101
        System.out.println("You entered: " + num);

        // Step 1: Binary to Decimal
        int rem, ans = 0;
        int mul = 1;
        while (num > 0) {
            rem = num % 10;
            ans = rem * mul + ans;
            mul = mul * 2;
            num = num / 10;
        }

        // Step 2: Decimal to Octal using your pattern
        int decimal = ans;
        ans = 0;
        mul = 1;
        while (decimal > 0) {
            rem = decimal % 8;
            ans = rem * mul + ans;
            mul = mul * 10;
            decimal = decimal / 8;
        }

        System.out.println("Octal: " + ans);
        sc.close();
    }
}
