class Solution {
public:
    int countSpecialIntegers(vector<int>& nums) {
        map<int,vector<int>> freq;
        for(int i=0;i<nums.size();i++)
            freq[nums[i]].push_back(i);
        int count = 0;
        for(auto [x,arr]:freq){
            if(arr.size()>=3){
                int gap = arr[1]-arr[0];
                bool flag = true;
                for(int i=0;i<arr.size()-1;i++){
                    if(arr[i+1]-arr[i]!=gap){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    count++;
            }
        }
        return count;
    }
};