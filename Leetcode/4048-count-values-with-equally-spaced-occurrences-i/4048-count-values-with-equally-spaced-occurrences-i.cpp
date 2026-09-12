class Solution {
public:
    int countSpecialIntegers(vector<int>& nums) {
        map<int,vector<int>> freq;
        for(int i=0;i<nums.size();i++)
            freq[nums[i]].push_back(i);
        int count = 0;
        for(auto [x,arr]:freq){
            if((arr.size()==3)&&(arr[2]-arr[1]==arr[1]-arr[0]))
                count++;
        }
        return count;
    }
};