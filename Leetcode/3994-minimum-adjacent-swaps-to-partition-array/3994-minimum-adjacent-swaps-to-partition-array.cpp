class Solution {
public:
    int minAdjacentSwaps(vector<int>& nums, int a, int b) {
        int mod = 1e9+7,n = nums.size(),partIndx = 0,swaps = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<a){
                swaps = (swaps%mod+(i-partIndx))%mod;
                partIndx++;
            }
        }
        int j = 0;
        partIndx = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<a)
                continue;
            if(nums[i]>=a&&nums[i]<=b){
                swaps = (swaps%mod+(j-partIndx))%mod;
                partIndx++;
            }
            j++;
        }
        return swaps;
    }
};