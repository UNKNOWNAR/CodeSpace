class Solution {
public:
    int passwordStrength(string password) {
        set<char> unique;
        for(char c:password)
            unique.insert(c);
        int score  = 0;
        for(auto &it:unique){
            if(it-'a'>=0&&it-'z'<=0)
                score += 1;
            else if(it-'A'>=0&&it-'Z'<=0)
                score += 2;
            else if(it-'0'>=0&&it-'9'<=0)
                score += 3;
            else
                score += 5;
        }
        return score;
    }
};
