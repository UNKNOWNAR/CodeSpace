class Solution {
public:
    vector<vector<string>> ans;
    unordered_map<string,int> mp;
    void dfs(string word, string beginWord, vector<string> &seq){
        if(word==beginWord){
            vector<string> temp=seq;
            reverse(temp.begin(),temp.end());
            ans.push_back(temp);
            return;
        }
        int steps=mp[word];
        for(int i=0;i<word.size();i++){
            char org=word[i];
            for(char ch='a';ch<='z';ch++){
                word[i]=ch;
                if(mp.find(word)!=mp.end() && mp[word]+1==steps){
                    seq.push_back(word);
                    dfs(word,beginWord,seq);
                    seq.pop_back();
                }
            }
            word[i]=org;
        }
    }
    vector<vector<string>> findLadders(string beginWord, string endWord, vector<string>& wordList) {
        unordered_set<string> st(wordList.begin(),wordList.end());
        queue<string> q;
        q.push(beginWord);
        st.erase(beginWord);
        mp[beginWord]=1;
        while(!q.empty()){
            string word=q.front();
            q.pop();
            int steps=mp[word];
            if(word==endWord)
                break;
            for(int i=0;i<word.size();i++){
                char org=word[i];
                for(char ch='a';ch<='z';ch++){
                    word[i]=ch;
                    if(st.find(word)!=st.end()){
                        q.push(word);
                        st.erase(word);
                        mp[word]=steps+1;
                    }
                }
                word[i]=org;
            }
        }
        if(mp.find(endWord)!=mp.end()){
            vector<string> seq;
            seq.push_back(endWord);
            dfs(endWord,beginWord,seq);
        }
        return ans;
    }
};