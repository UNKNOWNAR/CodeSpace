class Solution {
public:
    bool checkString(string s) {
        int n =s.size();
        int firstb = n-1;
        for(int i=0;i<n;i++){
            if(s[i]=='b')
                firstb = min(i,firstb);
            else if(s[i]=='a' && firstb<i)
                return false;
        }
        return true;
    }
};