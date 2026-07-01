class Solution {
public:
    vector<int> countWordOccurrences(vector<string>& chunks, vector<string>& queries) {
        vector<int>ans;
        map<string,int> freq;
        string s;
        for(auto &c:chunks)
            s += c;
        s = s+' ';
        int n = s.size();
        string word = "";
        for(int i=0;i<n;i++){
            if(s[i]=='-'){
                if(i==0||s[i-1]==' '||s[i-1]=='-')
                    continue;
                else if(i==n||s[i+1]==' '){
                    freq[word]++;
                    word = "";
                }
                else if(s[i+1]=='-'){
                    while(s[i]=='-')
                        i++;
                    if(word!=" "){
                        freq[word]++;
                        if(s[i]!=' ')
                            word = s[i];
                        else
                            word = "";
                    }
                }
                else
                    word += s[i];
            }
            else if(s[i]==' '){
                freq[word]++;
                word = "";
            }
            else
                word += s[i];
        }
        for(auto &q:queries){
            if(freq.contains(q))
                ans.push_back(freq[q]);
            else
                ans.push_back(0);
        }
        return ans;
    }
};
