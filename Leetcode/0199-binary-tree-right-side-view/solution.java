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
        int maxDepth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSide = new ArrayList<Integer>();

        if (root == null){
            return rightSide;
        }

        calculateRightSide(root, rightSide, 0);

        return rightSide;
    }

    public void calculateRightSide(TreeNode root, List<Integer> rightSide, int currentDepth) {

        if (maxDepth == currentDepth){
            rightSide.add(root.val);
            maxDepth += 1;
        }

        if (root.right != null){
            calculateRightSide(root.right, rightSide, currentDepth + 1);
        }
        if (root.left != null){
            calculateRightSide(root.left, rightSide, currentDepth + 1);
        }
    }
}
