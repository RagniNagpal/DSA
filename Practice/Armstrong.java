package Practice;

public class Armstrong {

    public boolean isArmstrong(int n) {
        int originalNum = n;
        int result = 0;
        int numDigit = 0;
        int temp = n;

        while (temp > 0) {
            numDigit++;
            temp /= 10;
        }

        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            result += Math.pow(digit, numDigit); // result is int, so it's okay here
            temp /= 10;
        }

        return result == originalNum;
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        int number = 153;

        if (obj.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
