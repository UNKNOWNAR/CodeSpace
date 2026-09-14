class Solution {
public:
    int calcDigitRange(int num){
        int min_val = 9,max_val = 0;
        while(num!=0){
            min_val = min(min_val,num%10);
            max_val = max(max_val,num%10);
            num /= 10;
        }
        return max_val-min_val;
    }
    int maxDigitRange(vector<int>& nums) {
        int max_val = 0;
        map<int,vector<int>> mp;
        for(int num:nums){
            int dr = calcDigitRange(num);
            max_val = max(max_val,dr);
            mp[dr].push_back(num);
        }
        int ans = 0;
        for(int num:mp[max_val])
            ans += num;
        return ans;
    }
};