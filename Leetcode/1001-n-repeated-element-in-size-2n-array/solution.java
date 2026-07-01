class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        
        for(int key:freqMap.keySet()){
            if(freqMap.get(key)!=1)
                return key;
        }
        return 0;
    }
}
