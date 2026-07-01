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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        if(root==null)
            return new ArrayList<>();
        if(root.left!=null)
            traversal.addAll(inorderTraversal(root.left));
        traversal.add(root.val);
        if(root.right!=null)
            traversal.addAll(inorderTraversal(root.right));
        return traversal;
    }
}
