class Solution {
public:
    using ll = long long;
    ll maxValue(vector<int>& nums) {
        int n = nums.size();
        ll curr_sum = 0,max_odd = -(1LL << 60),max_even = 0,max_even_len_sum = 0;
        for(int i=0;i<n;i++){
            ll val = (i&1)?-nums[i]:nums[i];
            curr_sum += val;
            if((i+1)&1){
                if (max_odd != -(1LL << 60))
                    max_even_len_sum = min(max_even_len_sum,curr_sum-max_odd);
                max_odd = max(max_odd,curr_sum);
            }
            else{
                max_even_len_sum = min(max_even_len_sum,curr_sum-max_even);
                max_even = max(max_even,curr_sum);
            }
        }
        return curr_sum-2*min(0LL,max_even_len_sum);
    }
};