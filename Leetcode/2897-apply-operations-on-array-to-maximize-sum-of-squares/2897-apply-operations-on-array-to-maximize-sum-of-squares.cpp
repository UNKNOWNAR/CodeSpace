class Solution {
public:
    int mod = 1e9+7;
    int maxSum(vector<int>& nums, int k) {
        vector<int> cnt(32,0);
        for(int num:nums){
            for(int b=0;b<32;b++){
                if(num&(1LL<<b))
                    cnt[b]++;
            }
        }
        long long res = 0;
        while(k--){
            long long num = 0;
            for(int i=0;i<32;i++){
                if(cnt[i]>0){
                    num = ((1LL<<i)+num)%mod;
                    cnt[i]--;
                }
            }
            num = num%mod;
            res = (res + (1LL * num * num) % mod) % mod;
        }
        return res;
    }
};