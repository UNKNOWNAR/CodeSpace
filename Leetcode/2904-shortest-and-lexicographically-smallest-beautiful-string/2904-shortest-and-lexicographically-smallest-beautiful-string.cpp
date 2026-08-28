class Solution {
public:
    string shortestBeautifulSubstring(string s, int k) {
        int n = s.size(),left = 0,count1 = 0;
        string ans = "";
        for(int right=0;right<n;right++){
            if(s[right]=='1')
                count1++;
            while(count1>k){
                if(s[left]=='1')
                    count1--;
                left++;
            }    
            while(s[left]=='0'&&count1==k)
                left++;      
            if(count1==k){
                if(ans==""||ans.size()>right-left+1)
                    ans = s.substr(left,right-left+1);         
                else if(ans>s.substr(left,right-left+1)&&ans.size()==right-left+1)
                    ans = s.substr(left,right-left+1);
            }
        }
        return ans;
    }
};