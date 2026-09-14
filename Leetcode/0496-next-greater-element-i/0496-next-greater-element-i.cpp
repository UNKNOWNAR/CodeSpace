class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int n2 = nums2.size(),n1 = nums1.size();
        map<int,int> greatest;
        stack<int> s;
        for(int i=n2-1;i>=0;i--){
            while(!s.empty()){
                if(s.top()>nums2[i]){
                    greatest[nums2[i]] = s.top();
                    break;
                }
                s.pop();
            }
            s.push(nums2[i]);
        }
        vector<int> ans(n1);
        for(int i=0;i<n1;i++){
            if(greatest.contains(nums1[i]))
                ans[i] = greatest[nums1[i]];
            else
                ans[i] = -1;
        }
        return ans;
    }
};