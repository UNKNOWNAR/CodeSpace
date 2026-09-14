class Solution {
public:
    int count(string s,char c){
        int count = 0;
        for(char x:s){
            if(x==c)
                count++;
        }
        return count;
    }
    vector<bool> transformStr(string s, vector<string>& strs) {
        int n = s.size(), c_0 = count(s,'0'),c_1 = count(s,'1');
        vector<bool> res;
        for(string str: strs){
            int c0_strs = count(str,'0');
            int c1_strs = count(str,'1');
            int diff_0 = c_0-c0_strs;
            int diff_1 = c_1-c1_strs;
            if(diff_0<0 or diff_1<0){
                res.push_back(false);
                continue;
            }
            for(int i=0;i<n;i++){
                if(!diff_0)
                    break;
                if(str[i]=='?'){
                    str[i] = '0';
                    diff_0--;
                }
            }
            for(int i=0;i<n;i++){
                if(!diff_1)
                    break;
                if(str[i]=='?'){
                    str[i] = '1';
                    diff_1--;
                }
            }
            int s_1_indx = 0,str_1_indx = 0;
            bool solved = true;
            for(int i=0;i<n;i++){
                if(s[i]=='1') s_1_indx++;
                if(str[i]=='1') str_1_indx++;
                if(str_1_indx>s_1_indx){
                    solved = false;
                    break;
                }
            }
            res.push_back(solved);
        }
        return res;
    }
};