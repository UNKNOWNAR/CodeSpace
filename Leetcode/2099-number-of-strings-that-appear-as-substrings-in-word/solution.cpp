class Solution {
public:
    int numOfStrings(vector<string>& patterns, string word) {
        int count = 0,n = word.size();
        unordered_map<string,int> uniq;

        for(auto &pattern:patterns)
            uniq[pattern]++;
        
        for(int i=0;i<n;i++){
            string temp = "";
            for(int j=i;j<n;j++){
                temp += word[j];
                if(uniq.contains(temp)){
                    count+=uniq[temp];
                    uniq[temp] = 0;
                }
            }
        }
        return count;
    }
};
