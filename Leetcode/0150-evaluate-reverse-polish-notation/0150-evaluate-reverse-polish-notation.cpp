class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<string> st;
        for(int i=0;i<tokens.size();i++){
            if(tokens[i]=="+"||tokens[i]=="-"||tokens[i]=="*"||tokens[i]=="/"){
                int a = stoi(st.top());
                st.pop();
                int b = stoi(st.top());
                st.pop();
                int val = 0;
                if(tokens[i]=="+")
                    val = a+b;
                else if(tokens[i]=="-")
                    val = b-a;
                else if(tokens[i]=="*")
                    val = a*b;
                else
                    val = b/a;
                st.push(to_string(val));
            }
            else
                st.push(tokens[i]);
        }
        return stoi(st.top());
    }
};