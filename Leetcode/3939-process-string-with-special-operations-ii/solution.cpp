class Solution {
    using ll = long long;
public:
    char processStr(string s, ll k) {
        int n = s.size();
        ll len = 0;
        for(char &c:s){
            if(c=='*'){
                if(len>0)
                    len--;
            }
            else if(c=='#')
                len *= 2;
            else if(c!='%')
                len++;
        }
        if(k>=len)
            return '.';
        for(int i=n-1;i>=0;i--){
            if(s[i]=='*')
                len++;
            else if(s[i]=='%')
                k = len-k-1;
            else if(s[i]=='#'){
                len /= 2;
                if(k>=len)
                    k -= len;
            }
            else
                len--;
            if(len==k)
                return s[i];
        }
        return '.';
    }
};
