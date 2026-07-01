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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        if(isLeaf(root))
            return true;
        return symmetric(root.left,root.right);
        
    }
    public boolean symmetric(TreeNode left,TreeNode right){
        boolean a=true;
        if((left==null&&right!=null)||(left!=null&&right==null))
            return false;
        else if(left==null&&right==null)
            return true;
        if(left.val!=right.val)
            return false;
        if(isLeaf(left)&&isLeaf(right))
            return true;
        a = symmetric(left.left,right.right);
        a = a && symmetric(left.right,right.left);
        return a;
    }
    public boolean isLeaf(TreeNode root){
        if(root.left==null&&root.right==null)
            return true;
        return false;
    }
}
