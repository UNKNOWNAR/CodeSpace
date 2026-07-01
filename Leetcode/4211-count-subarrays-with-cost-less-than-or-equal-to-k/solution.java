class Solution {
    public long countSubarrays(int[] nums, long k) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        long count = 0;
        int left = 0;
        for(int right=0;right<nums.length;right++){
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(right);

            while(!minDeque.isEmpty()&& nums[minDeque.peekLast()] >= nums[right]){
                minDeque.pollLast();
            }
            minDeque.addLast(right);

            while(left<=right&&!maxDeque.isEmpty()&&!minDeque.isEmpty()){
                long max = nums[maxDeque.peekFirst()];
                long min = nums[minDeque.peekFirst()];
                long length = right-left+1;
    
                if((max-min)*length>k){
                    left++;
                    if (maxDeque.peekFirst() < left) maxDeque.pollFirst();
                    if (minDeque.peekFirst() < left) minDeque.pollFirst();
                }
                else
                    break;
            }

            count += right-left+1;
        }
        return count;
    }
}
