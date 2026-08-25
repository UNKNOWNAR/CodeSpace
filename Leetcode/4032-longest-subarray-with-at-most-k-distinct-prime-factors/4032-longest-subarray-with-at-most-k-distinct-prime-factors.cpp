class Solution {
public:
    int longestSubarray(vector<int>& nums, int k) {
        int max_val = *max_element(nums.begin(),nums.end());
        vector<vector<int>> factors(max_val+1);
        vector<bool> is_prime(max_val+1,true);
        is_prime[0] = is_prime[1] = false;
        for(int i=0;i<=max_val;i++){
            if(is_prime[i]){
                for(int j=i;j<=max_val;j+=i){
                    factors[j].push_back(i);
                    is_prime[j] = false;
                }
            }
        }
        int max_length = 0,left = 0,dis_count = 0;
        vector<int> prime_count(max_val+1,0);
        for(int right=0;right<nums.size();right++){
            for(int f:factors[nums[right]]){
                if(prime_count[f]==0)
                    dis_count++;
                prime_count[f]++;
            }
            while(dis_count>k){
                for(int f:factors[nums[left]]){
                    prime_count[f]--;
                    if(prime_count[f]==0)
                        dis_count--;
                }
                left++;
            }
            max_length = max(max_length,right-left+1);
        }
        return max_length;
    }
};