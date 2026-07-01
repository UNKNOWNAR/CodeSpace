class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] stack = new int[nums.length];
        int top = -1;
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int curr = nums[i % nums.length];
            while (top != -1 && stack[top] <=curr)
                top--;
            if (i < nums.length) {
                nums[i] = (top == -1) ? -1 : stack[top];
            }
            stack[++top] = curr;
        }
        return nums;
    }
}
