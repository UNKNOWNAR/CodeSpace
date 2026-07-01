class Solution {
    using ll = long long;
public:
    ll maxSum(vector<int>& nums, int k, int mul) {
        ll sum = 0;
        int n = nums.size();
        sort(nums.rbegin(),nums.rend());
        for(int i=0;i<min(n,k);i++){
            if(mul>0){
                sum += 1LL*nums[i]*mul;
                mul--;
            }
            else
                sum += nums[i];
        }
        return sum;
    }
};
