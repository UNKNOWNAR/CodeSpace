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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return new ArrayList<>();
        if(root.left!=null)
            list.addAll(postorderTraversal(root.left));
        if(root.right!=null)
            list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
