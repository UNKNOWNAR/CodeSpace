class Solution {
    using ll = long long;
public:
    ll countMajoritySubarrays(vector<int>& nums, int target) {
        ll ans = 0;
        unordered_map<ll,ll> freq;
        freq[0] = 1;
        ll cumSum = 0,validLeftPoints = 0;
        for(auto &num:nums){
            if(num==target){
                validLeftPoints += freq[cumSum];
                cumSum++;
            }
            else{
                cumSum--;
                validLeftPoints -= freq[cumSum];
            }
            freq[cumSum]++;
            ans += validLeftPoints;
        }
        return ans;
    }
};
