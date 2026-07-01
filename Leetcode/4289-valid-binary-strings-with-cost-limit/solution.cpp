class Solution {
    set<string> uniquePairs;
    int n;
public:
    vector<string> generateValidStrings(int n, int k) {
        string s;
        this->n=n;
        for(int i=0;i<n;i++)
            s+='0';
        generate(s,k,0);
        vector<string> ans;
        for(auto &x:uniquePairs)
            ans.push_back(x);
        return ans;
    }
    void generate(string s,int k,int indx){
        if(uniquePairs.contains(s))
            return;
        uniquePairs.insert(s);
        for(int i=indx;i<n;i++){
            if(k<i)
                break;
            if(s[i]=='0'&&((i>=1&&s[i-1]=='0')||i==0)){
                if(i>=1&&s[i-1]=='1')
                    cout<<s;
                s[i] = '1';
                generate(s,k-i,i+1);
                s[i] = '0';
            }
        }
    }
};
