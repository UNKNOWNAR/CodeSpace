class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int minTime = 0;
        for(int i=0;i<colors.length()-1;i++){
            int sum = neededTime[i];
            int maxm = neededTime[i];
            while(i<colors.length()-1&&colors[i]==colors[i+1]){
                sum += neededTime[i+1];
                maxm = max(maxm,neededTime[i+1]);
                i++;
            }
            minTime += sum-maxm;
        }
        return minTime;
    }
};        
