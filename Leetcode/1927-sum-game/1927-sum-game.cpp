class Solution {
public:
    bool sumGame(string num) {
        int n = num.size(),diff = 0,countDiff = 0;
        for(int i=0;i<n;i++){
            if(num[i]=='?'){
                if(i<n/2)
                    countDiff++;
                else
                    countDiff--;
                continue;
            }
            if(i<n/2)
                diff += num[i]-'0';
            else
                diff -= num[i]-'0';
        }
        return (diff * 2 + countDiff * 9) != 0;
    }
};