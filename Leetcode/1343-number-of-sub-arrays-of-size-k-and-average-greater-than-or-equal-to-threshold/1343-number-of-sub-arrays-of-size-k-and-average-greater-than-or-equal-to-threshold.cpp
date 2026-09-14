class Solution {
public:
    int numOfSubarrays(vector<int>& nums, int k, int threshold) {
        int n = nums.size(),sum=0,count = 0;
        for(int r=0;r<k;r++)
            sum += nums[r];
        for(int i=k;i<n;i++){
            if(sum>=k*threshold)
                count++;
            sum += nums[i]-nums[i-k];
        }
        if(sum>=k*threshold)
            count++;
        return count;
    }
};