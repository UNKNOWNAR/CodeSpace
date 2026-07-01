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
    List<TreeNode> inorder;
    public TreeNode balanceBST(TreeNode root) {
        inorder = new ArrayList<>();
        createOrder(root);
        return createBST(0,inorder.size()-1);
    }
    private TreeNode createBST(int start,int end){
        if(start>end)
            return null;
        int middle = (start+end)>>1;
        TreeNode root = inorder.get(middle);
        root.left =  createBST(start,middle-1);
        root.right = createBST(middle+1,end);
        return root;
    }
    private void createOrder(TreeNode root){
        if(root==null)
            return;
        createOrder(root.left);
        inorder.add(root);
        createOrder(root.right);
    }
}
