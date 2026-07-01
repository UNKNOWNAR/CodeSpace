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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> collect = new ArrayList<>();
        Map<Integer,TreeNode> parent = new HashMap();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.right!=null){
                    q.offer(temp.right);
                    parent.put(temp.right.val,temp);
                }
                if(temp.left !=null){
                    q.offer(temp.left);
                    parent.put(temp.left.val,temp);
                }
            }
        }
        q = new LinkedList<>();
        q.offer(target);
        Set<Integer> visited = new HashSet<>();
        while(!q.isEmpty()){
            int size = q.size();
            if (k==0) 
                break;
            for(int i=0;i<size;i++){ 
                TreeNode temp = q.poll();
                visited.add(temp.val);
                if(temp.right!=null&&!visited.contains(temp.right.val))
                    q.offer(temp.right);
                if(temp.left !=null&&!visited.contains(temp.left.val))
                    q.offer(temp.left);
                if(parent.containsKey(temp.val) && !visited.contains(parent.get(temp.val).val)) 
                    q.offer(parent.get(temp.val));

            }
            k--;
        }
        for(TreeNode val:q)
            collect.add(val.val);
        return collect;
    }
}
