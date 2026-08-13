class Solution {
public:
    int minOperations(string s1, string s2) {
        int n = s1.size();
        int ops = 0;
        for(int i=0;i<n;i++){
            if(s1[i]!=s2[i]&&s1[i]=='1'){
                if(i==n-1){
                    if (n == 1) return -1;
                    if(s1[i-1]=='0'){
                        ops++;
                        s1[i-1] = '1';
                    }
                    ops++;
                    s1[i-1] = '0';
                    s1[i] = '0';
                    continue;
                }
                if(s1[i+1]=='0'){
                    s1[i+1] = '1';
                    ops++;
                }
                s1[i] = '0';
                s1[i+1] = '0';
                ops++;
            }
        }
        for(int i=0;i<n;i++){
            if(s1[i]!=s2[i]){
                s1[i]='1';
                ops++;
            }
        }
        return ops;
    }
};