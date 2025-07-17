package july17.Greedy;
import java.util.*;
public class AssignCookie {
  public static int findContentChildren(int[] g, int[] s) {
        // Step 1: Sort both arrays in ascending order
        // So we can try to satisfy the least greedy child with the smallest possible cookie
        Arrays.sort(g); // sort greed factors of children
        Arrays.sort(s); // sort sizes of cookies

        int i = 0; // Pointer for children (g array)
        int j = 0; // Pointer for cookies (s array)

        // Step 2: Iterate through both arrays using two pointers
        while (i < g.length && j < s.length) {
            // If current cookie can satisfy the current child's greed
            if (s[j] >= g[i]) {
                i++; // Child is content → move to next child
            }
            // In both cases, we move to the next cookie
            j++; // Cookie used or too small → move to next cookie
        }

        // Step 3: Return the number of content children
        // Because every time we increment i, one child was satisfied
        return i;
    }

    public static void main(String[] args) {
        // Example 1
        int[] g1 = {1, 2, 3}; // greed factors
        int[] s1 = {1, 1};    // cookie sizes
        System.out.println("Example 1 - Max content children = " + findContentChildren(g1, s1));
        // Output: 1 (Only one child can be satisfied)

        // Example 2
        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println("Example 2 - Max content children = " + findContentChildren(g2, s2));
        // Output: 2 (Both children can be satisfied)

        // Example 3
        int[] g3 = {2, 3, 4};
        int[] s3 = {1, 1, 5};
        System.out.println("Example 3 - Max content children = " + findContentChildren(g3, s3));
        // Output: 1 (Only the child with greed 4 can be satisfied with cookie 5)
    }
}
