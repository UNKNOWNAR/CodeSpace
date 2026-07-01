class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer,Integer> freqMap = new HashMap<>();
        Map<Integer,Integer> freqMap1 = new HashMap<>();
        for(int num:nums1){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
            freqMap1.put(num,freqMap1.getOrDefault(num,0)+1);
        }
        for(int num:nums2)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        List<Integer> swap= new ArrayList<>();
        for(int x:freqMap.keySet()){
            if(freqMap.get(x)%2!=0)
                return -1;
            if(freqMap1.getOrDefault(x,0)>freqMap.get(x)/2){
                for(int i=0;i<freqMap1.get(x)-(freqMap.get(x)/2);i++)
                    swap.add(x);
            }
        }        
        return swap.size();
    }
}
