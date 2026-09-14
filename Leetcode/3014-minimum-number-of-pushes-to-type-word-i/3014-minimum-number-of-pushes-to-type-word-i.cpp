class Solution {
public:
    int minimumPushes(string word) {
        int len = word.size();
        int it = 1;
        int ans = 0;
        while(len>=8){
            ans += it*8;
            it++;
            len -= 8;
        }
        ans += it*len;
        return ans;
    }
};