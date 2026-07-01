class Solution {
public:
    int getLength(vector<int>& nums) {
        int n = nums.size();
        int ans = 1,l=0,kr=0,count=0;
        for(int i=0;i<n;i++){
            map<int,int> freq;
            map<int, int> freq_counts;
            for(int j=i;j<n;j++){
                int num = nums[j];
                if (freq[num] > 0) {
                    freq_counts[freq[num]]--;
                    if (freq_counts[freq[num]] == 0) {
                        freq_counts.erase(freq[num]);
                    }
                }
                freq[nums[j]]++;
                freq_counts[freq[num]]++;
                if(freq.size()==1)
                    ans = max(ans, j - i + 1);
                if (freq_counts.size() == 2) {
                    int min_freq = freq_counts.begin()->first;
                    int max_freq = freq_counts.rbegin()->first;
                    if (max_freq == 2 * min_freq) 
                        ans = max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
};
