class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {
        unordered_set<int> temp;
        int n = nums.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp.insert(nums[i]^nums[j]);
            }
        }
        unordered_set<int> temp1;
        for(auto &x:temp){
            for(int i=0;i<n;i++)
                temp1.insert(x^nums[i]);
        }
        return temp1.size();
    }
};