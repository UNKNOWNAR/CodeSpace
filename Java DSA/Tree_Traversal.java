import java.util.*;
public class Tree_Traversal {
    // In-order DFS: Left, Root, Right
    public void inorder_traversal(Tree root){
        if (root == null) return;
        inorder_traversal(root.left);
        System.out.print(root.val + " ");
        inorder_traversal(root.right);
    }

    // Pre-order DFS: Root, Left, Right
    public void preorder_traversal(Tree root){
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }

    // Post-order DFS: Left, Right, Root
    public void postorder_traversal(Tree root){
        if (root == null) return;
        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(root.val + " ");
    }

    // BFS: Level order traversal
    public void levelorder_traversal(Tree root){
        if (root == null) return;
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(root);

        while (!queue.isEmpty()){
            root = queue.remove();
            System.out.print(root.val + " ");
            if (root.left != null) queue.add(root.left);
            if (root.right != null) queue.add(root.right);

        }
    }

    // BFS Search
    public boolean bfs_search(Tree root, int target) {
        if (root == null) return false;
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree current = queue.poll();
            if (current.val == target) return true;

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return false;
    }

    // DFS Search (Recursive Preorder)
    public boolean dfs_search(Tree root, int target) {
        if (root == null) return false;
        if (root.val == target) return true;

        return dfs_search(root.left, target) || dfs_search(root.right, target);
    }

    // Delete a node from Binary Tree (not BST)
    public void deleteNode(Tree root, int key) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (root.val == key) root = null;
            return;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        Tree keyNode = null;
        Tree temp = null;

        // Step 1: Find node to delete and last node
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.val == key)
                keyNode = temp;

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }

        //temp is the deepest rightmost node
        
        // Step 2: Replace key node's value with deepest node's value
        if (keyNode != null) {
            int x = temp.val;
            deleteDeepest(root, temp);  // Step 3: Delete the deepest node
            keyNode.val = x;           // Step 4: Replace
        }
    }

    // Helper to delete the deepest node
    private void deleteDeepest(Tree root, Tree delNode) {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree current = queue.poll();

            if (current == delNode) {
                current = null;
                return;
            }

            if (current.left != null) {
                if (current.left == delNode) {
                    current.left = null;
                    return;
                } else {
                    queue.add(current.left);
                }
            }

            if (current.right != null) {
                if (current.right == delNode) {
                    current.right = null;
                    return;
                } else {
                    queue.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree_Traversal obj = new Tree_Traversal();
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.left = new Tree(4);
        root.right.right = new Tree(5);
        obj.inorder_traversal(root);
        System.out.println();
        obj.preorder_traversal(root);
        System.out.println();
        obj.postorder_traversal(root);
        System.out.println();
        obj.levelorder_traversal(root);
        System.out.println();
        // Search Tests
        System.out.println("\n\nBFS Search for 4: " + obj.bfs_search(root, 4));  // true
        System.out.println("DFS Search for 6: " + obj.dfs_search(root, 6));     // false
        System.out.println("\nBefore Deletion (Level Order):");
        obj.levelorder_traversal(root);

        obj.deleteNode(root, 3);  // Delete node with value 3

        System.out.println("\nAfter Deletion (Level Order):");
        obj.levelorder_traversal(root);
    }
}
