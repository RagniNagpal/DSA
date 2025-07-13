package july13;

import java.util.*;

public class Maxrect {

    // MAH using NSL + NSR logic
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;

        ArrayList<Integer> NSL = new ArrayList<>();
        ArrayList<Integer> NSR = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        // NSL: Nearest Smaller to Left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            NSL.add(st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }

        st.clear();

        // NSR: Nearest Smaller to Right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            NSR.add(st.isEmpty() ? n : st.peek());
            st.push(i);
        }

        Collections.reverse(NSR);

        // Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = NSR.get(i) - NSL.get(i) - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Max Area Rectangle in Binary Matrix
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;

        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // Build histogram for current row
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            // Apply MAH for this row
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    // Test
    public static void main(String[] args) {
        char[][] matrix = {
            {'0', '1', '1', '0'},
            {'1', '1', '1', '1'},
            {'1', '1', '1', '1'},
            {'1', '1', '0', '0'}
        };

        int ans = maximalRectangle(matrix);
        System.out.println("Max Area Rectangle = " + ans);  // Output: 8
    }
}
