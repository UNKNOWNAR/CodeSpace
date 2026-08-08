class Solution {
public:
    string rearrangeString(string s, char x, char y) {
        map<char,int> freq;
        for(auto &c:s)
            freq[c]++;
        string ans = "";
        while(freq[y]--)
            ans += y;
        freq.erase(y);
        for(auto [c,x]:freq){
            while(x--)
                ans += c;
        }
        return ans;
    }
};