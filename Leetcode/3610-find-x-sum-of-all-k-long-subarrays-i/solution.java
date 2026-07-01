class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int ans[] = new int[nums.length-k+1];
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0;i<k;i++)
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(
            (a,b)->{
                int freqCompare = b.getValue().compareTo(a.getValue());
                if(freqCompare!=0)
                    return freqCompare;
                else
                    return b.getKey().compareTo(a.getKey());
            }
        );
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) 
            maxHeap.add(Map.entry(e.getKey(), e.getValue()));
        for(int i=0;i<=nums.length-k;i++){
            List<Map.Entry<Integer, Integer>> tempList = new ArrayList<>();
            Set<Integer> usedKeys = new HashSet<>();                // moved here: one set per window
            int effective = Math.min(x, freq.size());
            for(int j=0;j<effective;j++){
                Map.Entry<Integer, Integer> topElement;
                boolean garbage = true;
                while(garbage){
                    topElement = maxHeap.poll(); 
                    if(topElement==null)
                        break;
                    if(freq.containsKey(topElement.getKey()) 
                       && freq.get(topElement.getKey()).equals(topElement.getValue())
                       && !usedKeys.contains(topElement.getKey())){   // don't double-count same key
                        garbage = false;
                        usedKeys.add(topElement.getKey()); 
                        tempList.add(topElement);
                        ans[i] += topElement.getKey()*topElement.getValue();
                    }
                }  
            } 
            maxHeap.addAll(tempList);
            if(i<nums.length-k){
                freq.put(nums[i+k],freq.getOrDefault(nums[i+k],0)+1);
                maxHeap.add(Map.entry(nums[i+k],freq.get(nums[i+k])));
                if(freq.get(nums[i])==1)
                    freq.remove(nums[i]);
                else{
                    freq.put(nums[i],freq.get(nums[i])-1);
                    maxHeap.add(Map.entry(nums[i],freq.get(nums[i])));
                }
            }
        }
        return ans;
    }
}
