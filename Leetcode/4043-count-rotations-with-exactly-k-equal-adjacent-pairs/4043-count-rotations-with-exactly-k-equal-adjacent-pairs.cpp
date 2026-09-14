class Solution {
public:
    int countRotations(string s, int k) {
        int n = s.size();
        int count = 0;
        s = s+s;
        for(int i=0;i<n;i++){
            int match = 0;
            for(int j=0;j<n-1;j++){
                if(s[i+j]==s[i+j+1])
                    match++;
            }
            if(match==k)
                count++;
        }
        return count;
    }
};