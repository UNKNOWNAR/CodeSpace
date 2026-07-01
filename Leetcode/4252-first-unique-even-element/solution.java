class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num:nums)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        for(int num:nums){
            if(num%2==0&&freqMap.get(num)==1)
                return num;
        }
        return -1;
    }
}
