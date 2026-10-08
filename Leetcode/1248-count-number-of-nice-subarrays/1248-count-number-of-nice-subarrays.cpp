class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        unordered_map<int, int> prefixCount;
        prefixCount[0] = 1; 
        int currentOdds = 0;
        int ans = 0;
        
        for (int num : nums) {
            if (num & 1) 
                currentOdds++;
            if (prefixCount.find(currentOdds - k) != prefixCount.end()) 
                ans += prefixCount[currentOdds - k];            
            prefixCount[currentOdds]++;
        }
        
        return ans;
    }
};