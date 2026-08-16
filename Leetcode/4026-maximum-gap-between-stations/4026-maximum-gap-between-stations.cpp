class Solution {
public:
    int maximumGap(string skill, string station) {
        int n = skill.size(),m = station.size();
        vector<int> firstPos(n);
        int j = 0;
        for(int i=0;i<m;i++){
            if(j==n)
                break;
            if(skill[j]==station[i]){
                firstPos[j] = i;
                j++;
            }
        }
        j = n-1;
        vector<int> LastPos(n);
        for(int i=m-1;i>=0;i--){
            if(j==-1)
                break;
            if(skill[j]==station[i]){
                LastPos[j] = i;
                j--;
            }
        }
        int max_diff = 0;
        for(int i=0;i<n-1;i++)
            max_diff = max(LastPos[i+1]-firstPos[i],max_diff);
        return max_diff;
    }
};