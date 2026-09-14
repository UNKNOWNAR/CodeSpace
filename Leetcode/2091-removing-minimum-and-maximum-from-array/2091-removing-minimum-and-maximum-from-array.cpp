class Solution {
public:
    int minimumDeletions(vector<int>& nums) {
        int n = nums.size();
        if(n<=2)
            return n;
        int s = min_element(nums.begin(),nums.end())-nums.begin();
        int g = max_element(nums.begin(),nums.end())-nums.begin();
        if(s>g)
            return min(s+1,min(n+1+g-s,n-g));
        else
            return min(g+1,min(n+1+s-g,n-s));
    }
};