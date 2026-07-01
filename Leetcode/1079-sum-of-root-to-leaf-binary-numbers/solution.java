class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        if (node == null) return 0;

        // Shift left and add current bit
        currentSum = (currentSum << 1) | node.val;

        // If leaf node, return the path sum
        if (node.left == null && node.right == null) {
            return currentSum;
        }

        // Recursively sum both branches
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }
}
