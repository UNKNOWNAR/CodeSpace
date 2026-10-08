class Solution {
public:
    vector<string> ans;
    vector<string> generateParenthesis(int n) {
        string pattern = "";
        stack<char> st;
        solve(pattern, n, st);
        return ans;
    }
    bool isValid(string s) {
        stack<char> st;
        for(int i=0;i<s.size();i++){
            if(s[i]=='(')
                st.push(s[i]);
            else if(s[i]==')'){
                if(st.empty()||st.top()!='(')
                    return false;
                st.pop();
            }
        }
        return st.size()==0;
    }
    void solve(string& pattern,int n,stack<char> st){
        if(n<0)
            return;
        if(!n&&st.empty()){
            if(isValid(pattern))
                ans.push_back(pattern);
        }
        //open bracket
        if(n){
            pattern += '(';
            st.push('(');
            solve(pattern,n-1,st);
            pattern.pop_back();
            st.pop();
        }
        //close bracket
        if(!st.empty()){
            pattern += ')';
            st.pop();
            solve(pattern,n,st);
            pattern.pop_back();
            st.push('(');
        }
    }
};