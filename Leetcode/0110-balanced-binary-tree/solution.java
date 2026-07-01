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
    boolean res=true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return res;
    }
    int depth(TreeNode root){
        if(root==null) return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        //System.out.println(Math.abs(l-r)+" "+res);
        if(Math.abs(l-r)>1) res=false;
        //System.out.println(res);
        return Math.max(l,r)+1;
    }
}
