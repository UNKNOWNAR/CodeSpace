class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n];
        int top = -1;

        int max = 0;
        for (int i = 0; i < n; i++) {
            while (top != -1 && heights[i] <= heights[stack[top]]) {
                int height = heights[stack[top--]];
                int width = (top == -1) ? i : i - stack[top] - 1;
                max = Math.max(height * width, max);
            }
            stack[++top] = i;
        }

        // Process remaining bars in stack
        while (top != -1) {
            int height = heights[stack[top--]];
            int width = (top == -1) ? n : n - stack[top] - 1;
            max = Math.max(height * width, max);
        }

        return max;
    }
}
