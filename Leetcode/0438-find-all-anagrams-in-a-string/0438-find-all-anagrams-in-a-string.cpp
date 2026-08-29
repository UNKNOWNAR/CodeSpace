class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int n = s.size();
        int k = p.size();
        vector<int> p_count(26, 0);
        vector<int> window_count(26, 0);
        vector<int> ans;
        if (n < k) return ans;
        for (char c : p) 
            p_count[c - 'a']++;
        for (int r = 0; r < n; r++) {
            window_count[s[r] - 'a']++;
            if (r >= k) 
                window_count[s[r - k] - 'a']--;
            if (window_count == p_count) 
                ans.push_back(r - k + 1);
        }
        return ans;
    }
};