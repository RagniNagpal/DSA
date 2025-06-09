package Bit;

import java.util.Scanner;

public class KthBitset {
    static boolean isKthBitSet(int n,int k){
        int mask=1<<(k-1);
        return (n & mask)!=0;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter bit position to check (k): ");
        int k = sc.nextInt();
        if (isKthBitSet(n, k)) {
            System.out.println("Yes, " + k + "th bit is SET (1).");
        } else {
            System.out.println("No, " + k + "th bit is NOT set (0).");
        }

        sc.close();

    }
}
