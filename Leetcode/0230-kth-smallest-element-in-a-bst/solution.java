class Solution {
    // Global counter to track progress across recursion
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    private void traverse(TreeNode root, int k) {
        // Base case or if result already found
        if (root == null || count >= k) return;

        // 1. Go Left
        traverse(root.left, k);

        // 2. Process Node
        count++;
        if (count == k) {
            result = root.val;
            return;
        }

        // 3. Go Right
        traverse(root.right, k);
    }
}
