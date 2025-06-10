package Practice;
import java.util.Scanner;

public class TrailingZeros {

    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = countTrailingZeros(n);
        System.out.println("Trailing zeros in " + n + "! = " + result);
    }
}
