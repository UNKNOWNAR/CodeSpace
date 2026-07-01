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
        private int val;
    private TreeNode findNode(TreeNode root){//Inorder Traversal to find the appropriate Node
        if(root.left!=null){
            root.left = findNode(root.left);
            return root;
        }
        val = root.val;
        return root.right;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;
        if(root.val==key){
            if(root.left!=null&&root.right!=null){
                root.right = findNode(root.right);
                root.val = val;
                return root;
            }
            else if(root.left!=null){
                root = root.left;
                return root;
            }
            else if(root.right!=null){
                root = root.right;
                return root;
            }
            return null;
        }
        if(root.val>key)
            root.left = deleteNode(root.left,key);
        else
            root.right = deleteNode(root.right,key);
        return root;
    }
}
