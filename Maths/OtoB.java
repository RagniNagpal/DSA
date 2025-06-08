package Maths;

import java.util.Scanner;

public class OtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octNum = sc.nextInt();
        System.out.println("You entered (Octal): " + octNum);

        int decNum = 0;    
        int rem, ans = 0;
        int mul = 1;

        // Step 1: Convert Octal to Decimal
        while (octNum > 0) {
            rem = octNum % 10;
            octNum = octNum / 10;
            ans = rem * mul + ans;
            mul = mul * 8;
        }
        decNum = ans;

        // Step 2: Convert Decimal to Binary
        ans = 0;
        mul = 1;
        while (decNum > 0) {
            rem = decNum % 2;
            decNum = decNum / 2;
            ans = rem * mul + ans;
            mul = mul * 10;
        }

        System.out.println("Binary: " + ans);
        sc.close();
    }
}
