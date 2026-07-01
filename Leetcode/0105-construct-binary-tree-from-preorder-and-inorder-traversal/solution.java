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
    private int preorder_index;
    private Map <Integer, Integer> inorder_map; 

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorder_index = 0;
        inorder_map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorder_map.put(inorder[i], i );
        }

        return build_tree_helper(preorder, 0, inorder.length - 1);
    }

    private TreeNode build_tree_helper (int[] preorder, int inorder_start, int inorder_end) {
        if (inorder_start > inorder_end) {
            return null;
        }

        int root_val = preorder[preorder_index];
        TreeNode root = new TreeNode(root_val);

        preorder_index++;
        int inorder_root_index = inorder_map.get(root.val);

        root.left = build_tree_helper(preorder, inorder_start, inorder_root_index -1);

        root.right = build_tree_helper(preorder, inorder_root_index + 1, inorder_end);

        return root;
    }
}
