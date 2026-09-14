class Solution {
public:
    bool canMakeSubsequence(string s, string t) {
        if(s.size()>t.size())
            return false;
        if(s.size()==1)
            return true;
        int n = s.size(), m = t.size();
        vector<int> prefixMatch(n,-1),suffixMatch(n,m);
        int i = 0,j = 0;
        while(i<n&&j<m){
            if(s[i]==t[j]){
                prefixMatch[i] = j;
                i++;
            }
            j++;
        }
        if(i==n)
            return true;
        i=n-1,j=m-1;
        while(j>=0&&i>=0){
            if(s[i]==t[j]){
                suffixMatch[i] = j;
                i--;
            }
            j--;
        }
        for(int k=0;k<n;k++){
            if(k==0&&suffixMatch[1]!=0&&suffixMatch[1]!=m)
                return true;
            else if(k==n-1&&prefixMatch[n-2]!=-1&&prefixMatch[n-2]!=m-1)
                return true;
            else if(k > 0 && k < n - 1) {
                if(prefixMatch[k-1] != -1 && suffixMatch[k+1] != m) {
                    if(suffixMatch[k+1] - prefixMatch[k-1] >= 2) 
                        return true;
                }
            }
        }
        return false;
    }
};