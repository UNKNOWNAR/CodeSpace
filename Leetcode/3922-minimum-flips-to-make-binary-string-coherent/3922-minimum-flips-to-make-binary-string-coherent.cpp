class Solution {
public:
    int minFlips(string s) {
        int c1 = 0,c0=0;
        for(auto c:s){
            if(c=='1')
                c1++;
            else c0++;
        }
        return min(c0,max(c1-1-(s.front()&s.back()&1),0));
    }
};