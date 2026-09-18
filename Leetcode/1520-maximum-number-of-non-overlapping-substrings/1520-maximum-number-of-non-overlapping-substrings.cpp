class Solution {
public:
    vector<string> maxNumOfSubstrings(string s) {
        int n = s.size();
        vector<int> start(26,-1);
        vector<int> end(26,0);
        vector<bool> isValid(26,true);
        for(int i=0;i<n;i++){
            int indx = s[i]-'a';
            if(start[indx]==-1)
                start[indx] = i;
            end[indx] = i;
        }
        for(int c=0;c<26;c++){
            if(start[c]==-1)
                continue;
            for(int i=start[c];i<=end[c];++i){
                if(start[s[i]-'a']<start[c]){
                    isValid[c] = false;
                    break;
                }
                end[c] = max(end[c],end[s[i]-'a']);
            }
        }
        vector<string> result;
        int lastIndxStart = 1e9;
        for(int i=n-1;i>=0;i--){
            int c = s[i]-'a';
            if(!isValid[c]) continue;
            if(i==start[c]&&end[c]<lastIndxStart){
                result.push_back(s.substr(i,end[c]-i+1));
                lastIndxStart = start[c];
            }
        }
        return result;
    }
};