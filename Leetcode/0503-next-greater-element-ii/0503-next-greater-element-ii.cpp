class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        int n = nums.size();
        stack<int> s;
        for(int i=n-1;i>=0;i--)
            s.push(nums[i]);
        vector<int> ans(n,-1);
        for(int i=n-1;i>=0;i--){
            while(!s.empty()){
                if(s.top()>nums[i]){
                    ans[i] = s.top();
                    break;
                }
                s.pop();
            }
            s.push(nums[i]);
        }
        return ans;
    }
};