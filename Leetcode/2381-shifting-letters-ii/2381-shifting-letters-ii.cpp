class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        int n = s.size();
        vector<int> diff(n+1);
        for (auto &q : shifts) {
            int l = q[0];
            int r = q[1];
            int val = (q[2] == 1) ? 1 : -1;
            diff[l] += val;
            if (r + 1 < n)
                diff[r + 1] -= val;
        }
        for(int i=1;i<n;i++)
            diff[i]+=diff[i-1];
        for(int i=0;i<n;i++){
            int shift = ((diff[i] % 26) + 26) % 26;
            s[i] = (char)((((s[i]-'a')+shift)%26)+'a');
        }
        return s;
    }
};