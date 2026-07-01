class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> ans = new ArrayList<>();
        LinkedList<Long> stack = new LinkedList<>();
        
        for(int i=0;i<nums.length;i++){
            long current = (long)nums[i];
            while(!stack.isEmpty()&&stack.getLast()==current){
                stack.removeLast();
                current=current*2;
            }
            stack.addLast(current);
        }

        while(!stack.isEmpty())
            ans.add(stack.removeFirst());
        return ans;
    }
}
