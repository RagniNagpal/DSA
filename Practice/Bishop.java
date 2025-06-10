package Practice;

public class Bishop {
    public int bishop(int A, int B) {
        int count = 0;
        count += Math.min(8 - A, 8 - B);   // top-right
        count += Math.min(8 - A, B - 1);   // bottom-right
        count += Math.min(A - 1, B - 1);   // bottom-left
        count += Math.min(A - 1, 8 - B);   // top-left
        return count;
    }

    public static void main(String[] args) {
        Bishop obj = new Bishop();
        System.out.println("Bishop moves from (4,4): " + obj.bishop(4, 4)); // Output: 13
    }
}
