class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Map<Integer,Integer> map1 = new HashMap<>();

        for(int num:map.values()){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if(map1.get(freq)==1)
                return entry.getKey();
        }
        return -1;
    }
}
