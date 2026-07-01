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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeUtil(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode buildTreeUtil(int[] inorder,int ist,int iend, int[] postorder,int pst,int pend){
        if(ist>iend || pst>pend)return null;
        TreeNode root=new TreeNode(postorder[pend]);
        int istart=iend;
        int count=0;
        while(postorder[pend]!=inorder[istart]){
            istart--;
            count++;
        }
        int pstart=pend-count;
        root.left=buildTreeUtil(inorder,ist,istart-1,postorder,pst,pstart-1);
        root.right=buildTreeUtil(inorder,istart+1,iend,postorder,pstart,pend-1);
        return root;
    } 
}
