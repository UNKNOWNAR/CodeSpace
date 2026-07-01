class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((e1,e2)->freqMap.get(e1)-freqMap.get(e2));

        for(int key:freqMap.keySet()){
            minHeap.add(key);

            if(minHeap.size()>k)
                minHeap.poll();
        }

        while(minHeap.size()!=0)
            result[--k] = minHeap.poll();
        return result;
    }
}
