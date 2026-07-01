class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n<=1)    return 0;
        Deque<Integer> queue = new ArrayDeque<>();
        boolean visited[] = new boolean[n];
        queue.offer(0);
        int jumps=0;
        while(!queue.isEmpty()){
             int size = queue.size(); 
            jumps++; 
            for(int s=0;s<size;s++){
                int indx = queue.poll();
                for(int i=indx+1;i<=Math.min(n-1,indx+nums[indx]);i++){
                    if(i==n-1)
                        return jumps;
                    if(!visited[i]){
                        queue.offer(i);
                        visited[i] = true;
                    }
                }
            }
        }
        return -1;
    }
}
