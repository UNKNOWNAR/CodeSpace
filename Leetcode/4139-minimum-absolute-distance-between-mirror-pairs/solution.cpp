static const int speedup = []() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(NULL);
    return 0;
}();
class Solution {
private:
    int reverse(int x){
        int temp = 0;
        while(x>0)
        {
            temp = x%10+temp*10;
            x /= 10;
        }
        return temp;
    }
public:
    int minMirrorPairDistance(vector<int>& nums) {
        unordered_map<int, int> map;
        int n=nums.size(),ans = nums.size();
        for(int i=n-1;i>=0;i--){
            int rev = reverse(nums[i]);
            if(map.count(rev))
                ans = min(ans,map[rev]-i);
            map[nums[i]] = i;
        }
        return ans==n?-1:ans;
    }
};
