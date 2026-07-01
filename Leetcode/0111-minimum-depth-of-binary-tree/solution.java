/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Leaf node: a node with no left or right children
    private int minHeight = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return minHeight;
    }

    // Depth-first search to find the minimum depth to a leaf node
    public void dfs(TreeNode node, int height) {
        height++;

        // If current depth equals the current minimum, no need to explore further
        if (height == minHeight) 
            return;

        // If it's a leaf node, update minHeight
        if (isLeaf(node)) {
            minHeight = Math.min(minHeight, height);
            return;
        }

        // Only go left if it's not a shortcut to a leaf already explored
        if (node.left != null && (node.right == null || !isLeaf(node.right))) {
            dfs(node.left, height);
        }

        // Always check right subtree
        if (node.right != null) {
            dfs(node.right, height);
        }
    }

    // Utility method to check if a node is a leaf
    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
