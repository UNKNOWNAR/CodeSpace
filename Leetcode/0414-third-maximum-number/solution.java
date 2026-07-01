class Solution {
    public int thirdMax(int[] nums) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       Set<Integer> set = new HashSet<>();
       for(int num:nums){
            if(!(set.contains(num))){
                set.add(num);
                maxHeap.add(num);
            }
       }
       if(maxHeap.size()<3)
        return maxHeap.poll();
       maxHeap.poll();
       maxHeap.poll();
       return maxHeap.poll();
    }
}
