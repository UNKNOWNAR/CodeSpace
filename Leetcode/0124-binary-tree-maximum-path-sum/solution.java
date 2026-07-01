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
    private int maxi;
    public int maxPathSum(TreeNode root) {
        maxi = Integer.MIN_VALUE;
        calcPathSum(root);
        return maxi;
    }
    public int calcPathSum(TreeNode root){
        if(root==null)
            return 0;
        int leftSum = Math.max(0,calcPathSum(root.left));
        int rightSum = Math.max(0,calcPathSum(root.right));

        maxi = Math.max(maxi,leftSum+rightSum+root.val);
        return root.val+Math.max(leftSum,rightSum);
    }
}
