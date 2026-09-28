class Solution {
public:
    int maxDepth(string s) {
        stack<char> st;
        int ans = 0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='(')
                st.push(s[i]);
            if(s[i]==')')
                st.pop();    
            ans = max(ans, static_cast<int>(st.size()));       
        }
        return ans;
    }
};