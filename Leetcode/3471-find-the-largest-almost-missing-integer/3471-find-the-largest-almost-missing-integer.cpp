class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {
        int n = nums.size();
        map<int,int> freq;
        for(int i=0;i<n;i++)
            freq[nums[i]]++;
        int min_val = -1;
        if(k==1){
            for(auto [n,f]:freq)
                if(f==1)    min_val = max(min_val,n);
            return min_val;
        }
        if(k==n)
            return *max_element(nums.begin(),nums.end());
        if(freq[nums[0]]==1)    min_val = max(min_val,nums[0]);
        if(freq[nums[n-1]]==1)  min_val = max(min_val,nums[n-1]);
        return min_val;
    }
};