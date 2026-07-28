class Solution {
public:
    string smallestPalindrome(string s) {
        vector<bool> uniq(26);
        unordered_map<char,int> freq;
        for(auto &c:s){
            uniq[c-'a']=true;
            freq[c]++;
        }
        string front,mid,end;
        for(int i=0;i<26;i++){
            char c = (char)(i+'a');
            if(!uniq[i])
                continue;
            while(freq[c]>0){
                if(freq[c]==1){
                    mid += c;
                    freq[c]--;
                    continue;
                }
                front += c;
                freq[c]-=2;
            }
        }
        end = front;
        reverse(end.begin(),end.end());
        return front+mid+end;
    }
};