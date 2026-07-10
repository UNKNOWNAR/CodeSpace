class Solution {
public:
    vector<string> validateCoupons(vector<string>& code, vector<string>& businessLine, vector<bool>& isActive) {
        vector<pair<string,string>> temp;
        int n = code.size();
        for(int i=0;i<n;i++){
            if(!isActive[i])
                continue;
            if(businessLine[i]!="electronics"&&businessLine[i]!="grocery"&&businessLine[i]!="pharmacy"&&businessLine[i]!="restaurant")
                continue;
            bool flag = false;
            if(code[i]=="")
                continue;
            for(auto &c:code[i]){
                if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')||c=='_')
                    continue;
                else{
                    flag = true;
                    break;
                }
            }
            if(flag)
                continue;
            temp.push_back({businessLine[i],code[i]});
        }
        sort(temp.begin(),temp.end());
        vector<string> ans;
        for(auto &x:temp)
            ans.push_back(x.second);
        return ans;
    }
};