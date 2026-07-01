class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
            maxHeap.add(stone);
        
        while(maxHeap.size()>=2){
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if(stone1!=stone2||maxHeap.size()==0)
                maxHeap.add(stone1-stone2);
        }
        return maxHeap.poll();
    }
}
