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
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;
        countgoodNodes(root,root.val);
        return count;
    }
    public void countgoodNodes(TreeNode root,int max){
        if(root.val>=max){
            count++;
            max = root.val;
        }
        if(root.left!=null)
            countgoodNodes(root.left,max);
        if(root.right!=null)
            countgoodNodes(root.right,max);
    }
}
