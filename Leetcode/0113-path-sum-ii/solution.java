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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return res;
        traversePath(root,targetSum);
        return res;
    }
    public void traversePath(TreeNode root,int targetSum){
        curr.add(root.val);
        if(isleafNode(root)&&root.val==targetSum)
            res.add(new ArrayList<>(curr));
        if(root.left!=null)
            traversePath(root.left,targetSum-root.val);
        if(root.right!=null)
            traversePath(root.right,targetSum-root.val);
        curr.remove(curr.size()-1);
    }
    private boolean isleafNode(TreeNode root){
        if(root.left==null&&root.right==null)
            return true;
        return false;
    }
}
