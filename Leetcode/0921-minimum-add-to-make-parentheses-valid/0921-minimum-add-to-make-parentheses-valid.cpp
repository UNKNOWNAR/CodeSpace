class Solution {
public:
    int minAddToMakeValid(string s) {
        int ans = 0,res = 0;
        for(char c:s){
            if(c=='(')
                ans++;
            else
                ans--;
            if(ans<0){
                res++;
                ans++;
            }
        }
        return abs(ans+res);
    }
};