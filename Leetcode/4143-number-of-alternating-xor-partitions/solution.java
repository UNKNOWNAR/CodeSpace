class Solution {
    int moudlo = 1000000007;
    public int alternatingXOR(int[] nums, int target1, int target2) {
        Map<Integer,Integer> map0 = new HashMap<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        map0.put(0,1);
        int curr = 0;
        int ans = 0;
        for(int num:nums){
            curr^=num;
            int finish1 = map0.getOrDefault(curr^target1,0);
            int finish2 = map1.getOrDefault(curr^target2,0);
            ans = (finish1+finish2)%moudlo;
            if(finish1>0){
                map1.put(curr,(map1.getOrDefault(curr,0)+finish1)%moudlo);
            }
            if(finish2>0)
                map0.put(curr,(map0.getOrDefault(curr,0)+finish2)%moudlo);
        }
        return ans;
    }
}
