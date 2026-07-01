/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder ans = new StringBuilder();
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        while(!tree.isEmpty()){
            int lvlSize = tree.size();
            for(int i=0;i<lvlSize;i++){
                TreeNode temp = tree.poll();
                if (temp == null) 
                    ans.append("#,"); 
                else {
                    ans.append(temp.val).append(","); 
                    tree.add(temp.left);
                    tree.add(temp.right);
                }
            }
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;
        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        int i = 1;
       while (!tree.isEmpty() && i < nodes.length) {
            TreeNode parent = tree.poll();
            if (!nodes[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                parent.left = left;
                tree.add(left);
            }
            i++;
            if (i < nodes.length && !nodes[i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                parent.right = right;
                tree.add(right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
