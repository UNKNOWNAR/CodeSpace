class Solution {
public:
    int minInsertions(string s) {
        int count = 0,res = 0,n=s.size();
        for(int i=0;i<n;i++){
            if(s[i]=='(')
                count++;
            else{
                if(count<=0)
                    res++;
                else
                    count--;
                if(i<n-1&&s[i+1]==')')
                    i++;
                else
                    res++;
            }
        }
        return res+count*2;
    }
};