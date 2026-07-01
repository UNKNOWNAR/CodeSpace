class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer,Integer> freq = new HashMap();
        for(int num:nums)
            freq.put(num,freq.getOrDefault(num,0)+1);
        int minm = nums[0];
        List<Integer> temp = new ArrayList<>();
        for (int key : freq.keySet()) {
            temp.add(key);
        }
        Collections.sort(temp);
        for(int i=1;i<temp.size();i++){
            if(freq.get(temp.get(i))!=freq.get(temp.get(0)))
                return new int[]{temp.get(0),temp.get(i)};
        }
        return new int[]{-1,-1};
    }
}
