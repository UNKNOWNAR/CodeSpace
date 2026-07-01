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
    long min;
    long Secondmin;
    public int findSecondMinimumValue(TreeNode root) {
        min = Long.MAX_VALUE;
        Secondmin = Long.MAX_VALUE;
        traverse(root);
        return Secondmin==Long.MAX_VALUE?-1:(int)Secondmin;
    }
    private void traverse(TreeNode root) {
        if (root == null ) return;
        traverse(root.right);

        if(min>root.val){
            Secondmin = min;
            min = root.val;
        }
        else if(Secondmin>root.val&&min<root.val)
            Secondmin = root.val;
        traverse(root.left);
    }
}
