class Solution {
    public int specialTriplets(int[] nums) {
        int leftCnt[]=new int[100001];
        int rightCnt[]=new int[100001];
        long ans=0;
        int mod=(int)1e9+7;
        for(int num:nums) rightCnt[num]++;
        for(int num:nums){
            long val=num*2;
            rightCnt[num]--;
            if(val<=100000){
                ans=(ans+(long)leftCnt[(int)val]*rightCnt[(int)val])%mod;
            }
            leftCnt[num]++;
        }
        return (int)ans;
    }
}
