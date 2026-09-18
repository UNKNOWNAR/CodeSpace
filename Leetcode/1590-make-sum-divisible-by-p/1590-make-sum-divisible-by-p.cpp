class Solution {
public:
    int minSubarray(vector<int>& nums, int p) {
        int target = 0;
        for(auto &x:nums){
            x = x%p;
            target = (x+target)%p;
            x = target;
        }
        if(!target)
            return 0;
        int n = nums.size();
        map<int,int> prevIndx;
        prevIndx[0] = -1;
        int ans = n;
        for(int i=0;i<n;i++){
            if(prevIndx.contains((nums[i]-target+p)%p))
                ans = min(ans,i-prevIndx[(nums[i]-target+p)%p]);
            prevIndx[nums[i]] = i;
        }
        return ans==n?-1:ans;
    }
};