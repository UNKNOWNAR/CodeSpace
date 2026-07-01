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
    long totalSum;
    long maxProd;
    public int maxProduct(TreeNode root) {
        totalSum = getSum(root);
        getSumAndUpdate(root);
        return (int)(maxProd % 1_000_000_007);
        
    }
    private long getSumAndUpdate(TreeNode root) {
        if (root == null) return 0;
        
        long left = getSumAndUpdate(root.left);
        long right = getSumAndUpdate(root.right);
        
        long subSum = left + right + root.val;
        
        // Update max product (Current Subtree Sum * Remaining Sum)
        long currentProd = subSum * (totalSum - subSum);
        maxProd = Math.max(maxProd, currentProd);
        
        return subSum;
    }
    private long getSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + getSum(root.left) + getSum(root.right);
    }
}
