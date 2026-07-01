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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map = new HashMap<>();
        Set<Integer> child = new HashSet<>();
        for(int description[] : descriptions){
            if(!map.containsKey(description[0]))
                map.put(description[0],new TreeNode(description[0]));
            if(!map.containsKey(description[1]))
                map.put(description[1], new TreeNode(description[1]));
            TreeNode parent = map.get(description[0]);
            TreeNode children = map.get(description[1]);
            child.add(children.val);
            if(description[2]==1)
                parent.left = children;
            else
                parent.right = children;
        }
        for (int parentVal : map.keySet()) {
            if (!child.contains(parentVal)) 
                return map.get(parentVal);
        }
        return null;
    }
}
