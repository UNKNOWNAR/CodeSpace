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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).root;
    }
    private Result dfs(TreeNode root){
        if(root==null)  return new Result(null,0);

        Result left = dfs(root.left);
        Result right = dfs(root.right);

        if(left.depth==right.depth)
            return new Result(root,left.depth+1);
        else if(left.depth>right.depth)
            return new Result(left.root,left.depth+1);
        else
            return new Result(right.root,right.depth+1);
    }
    class Result{
        TreeNode root;
        int depth;
        Result(TreeNode root,int depth){
            this.root = root;
            this.depth = depth;
        }
    }
}
