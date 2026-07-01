class Solution {
    using ll = long long;
public:
    vector<long long> distance(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,ll> indxCount;
        unordered_map<int,ll> indxSum;
        vector<ll> answer(n, 0);
        indxCount.reserve(n);
        indxSum.reserve(n);
        for(int i=0;i<n;i++){
            if(!indxCount.contains(nums[i])){
                indxCount[nums[i]]=0;
                indxSum[nums[i]] = 0;
            }
            answer[i] = indxCount[nums[i]]*i-indxSum[nums[i]];
            indxCount[nums[i]]++;
            indxSum[nums[i]] += i;
        }
        indxCount.clear();
        indxSum.clear();
        for(int i=n-1;i>=0;i--){
            if(!indxCount.contains(nums[i])){
                indxCount[nums[i]]=0;
                indxSum[nums[i]] = 0;
            }
            answer[i] += indxSum[nums[i]]-indxCount[nums[i]]*i;
            indxCount[nums[i]]++;
            indxSum[nums[i]] += i;
        }
        return answer;
    }
};
