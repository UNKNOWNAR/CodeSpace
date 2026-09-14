class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        if(find(wordList.begin(), wordList.end(), endWord) == wordList.end())
            return 0;
        wordList.push_back(beginWord);
        int n = wordList.size();
        vector<vector<int>> adj(n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i==j)
                    continue;
                string w = wordList[i];
                string w1 = wordList[j];
                int indx = 0;
                int diff = 0;
                while(indx<w.size()&&diff<2){
                    if(w[indx]!=w1[indx])
                        diff++;
                    indx++;
                }
                if(diff==1){
                    adj[i].push_back(j);
                    adj[j].push_back(i);
                }
            }
        }
        vector<bool> vis(n);
        queue<int> q;
        q.push(n-1);
        vis[n-1] = true;
        int ops = 1;
        while(!q.empty()){
            int sz = q.size();
            while(sz--){
                int node = q.front();
                q.pop();
                for(int next:adj[node]){
                    if(vis[next])
                        continue;
                    if(wordList[next]==endWord)
                        return ops+1;
                    vis[next] = true;
                    q.push(next);
                }
            }
            ops++;
        }
        return 0;
    }
};