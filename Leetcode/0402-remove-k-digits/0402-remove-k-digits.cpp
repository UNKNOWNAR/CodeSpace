class Solution {
public:
    string removeKdigits(string num, int k) {
        stack<int> st;
        for(int i=0;i<num.size();i++){
            int d = num[i]-'0';
            while(!st.empty()&&k>0&&st.top()>d){
                st.pop();
                k--;
            }
            st.push(d);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.empty())  return "0";
        string res = "";
        while(!st.empty()){
            res += char(st.top()+'0');
            st.pop();
        }
        while(!res.empty()&&res.back()=='0')
            res.pop_back();
        if(res.empty())
            return "0";
        reverse(res.begin(),res.end());
        return res;
    }
};