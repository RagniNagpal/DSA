package Practice;

public class Nim {

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int totalStones = 7;

        if (canWinNim(totalStones)) {
            System.out.println("Player 1 can win the game.");
        } else {
            System.out.println("Player 1 cannot win the game.");
        }
    }
}
