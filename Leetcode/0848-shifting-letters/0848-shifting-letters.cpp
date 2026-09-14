class Solution {
    using ll = long long;
public:
    string shiftingLetters(string s, vector<int>& shifts) {
        ll sum = 0;
        for(int i=shifts.size()-1;i>=0;i--){
            sum += shifts[i];
            sum %= 26;
            s[i] = (char)((((s[i]-'a')+sum)%26)+'a');
        }
        return s;
    }
};