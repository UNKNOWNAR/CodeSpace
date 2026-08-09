class Solution {
public:
    int priority(char c){
        if(c=='*'||c=='/')
            return 2;
        else if(c=='-'||c=='+')
            return 1;
        return -1;
    }
    int num(int &i,string &s){
        string nums = "";
        while(i<s.size()&&s[i]==' ')
            i++;
        int val = 0;
        while (i < s.size() && isdigit(s[i])) {
            val = val * 10 + (s[i] - '0');
            i++;
        }
        i--;
        return val;
    }
    int calculate(string s) {
        deque<string> st;
        for(int i=0;i<s.size();i++){
            if(s[i]==' ')
                continue;
            if(priority(s[i])!=-1){
                if(priority(s[i])==1)
                    st.push_back(string(1, s[i]));
                else{
                    char op = s[i];
                    int a = stoi(st.back());
                    st.pop_back();
                    int b = num(++i,s);
                    int val = 0;
                    if(op=='*')
                        val = a*b;
                    else
                        val = a/b;
                    st.push_back(to_string(val));
                }
            }
            else
                st.push_back(to_string(num(i,s)));
        }
        while (st.size() > 1) {
            int a = stoi(st.front());
            st.pop_front();
            char op = st.front()[0];
            st.pop_front();
            int b = stoi(st.front());
            st.pop_front();
            if (op == '+')
                st.push_front(to_string(a + b));
            else
                st.push_front(to_string(a - b));
        }
        return stoi(st.front());
    }
};