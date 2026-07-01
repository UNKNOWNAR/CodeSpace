/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return travserse(p,q,root,root);
    }
    public TreeNode travserse(TreeNode p, TreeNode q,TreeNode nodeP,TreeNode nodeQ){
        TreeNode temp = nodeP;
        if(nodeP.val<p.val)
            nodeP = nodeP.right;
        else if(nodeP.val>p.val)
            nodeP = nodeP.left;
        if(nodeQ.val<q.val)
            nodeQ = nodeQ.right;
        else if(nodeQ.val>q.val)
            nodeQ = nodeQ.left;
        if(nodeQ!=nodeP)
            return temp;
        return travserse(p,q,nodeP,nodeQ);
    }
}
