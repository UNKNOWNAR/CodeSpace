class Solution {
public:
    string mapWordWeights(vector<string>& words, vector<int>& weights) {
        string answer = "";
        for(auto &word:words){
            int result = 0;
            for(auto &c:word)
                result += weights[c-'a'];
            answer += char(25 - (result)%26+'a');
        }
        return answer;
    }
};
