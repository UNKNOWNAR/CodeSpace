class Solution {
public:
    int countValidPrefixes(string s) {
        int n = s.size(),count=0,count_0=0,count_1=0;
        for(int i=0;i<n;i++){
            if(s[i]=='0')
                count_0++;
            else
                count_1++;
            if(abs(count_1-count_0)<=1)
                count++;
        }
        return count;
    }
};