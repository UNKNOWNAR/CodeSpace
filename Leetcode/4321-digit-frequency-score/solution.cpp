class Solution {
public:
    int digitFrequencyScore(int n) {
        map<int,int> freq;
        while(n!=0){
            int digit = n%10;
            n/=10;
            freq[digit]++;
        }
        long long ans = 0;
        for(auto const& [key,val]:freq){
            ans += (long long)key*val;
        }
        return ans;
    }
};
