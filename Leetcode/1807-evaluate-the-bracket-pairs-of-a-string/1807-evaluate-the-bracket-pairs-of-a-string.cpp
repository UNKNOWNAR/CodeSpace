class Solution {
public:
    string evaluate(string s, vector<vector<string>>& knowledge) {
        unordered_map<string,string> link;
        for(auto x:knowledge)
            link[x[0]] = x[1]; 
        int n = s.size();
        string ans = "";
        for(int i=0;i<n;i++){
            if(s[i]=='('){
                string temp = "";
                i++;
                while(s[i]!=')')
                    temp += s[i++];
                if(link.contains(temp))
                    ans += link[temp];
                else
                    ans += '?';
            }
            else
                ans += s[i];
        }
        return ans;
    }
};