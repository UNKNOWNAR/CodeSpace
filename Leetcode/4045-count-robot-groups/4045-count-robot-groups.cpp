class Solution {
public:
    int countGroups(vector<int>& position, vector<int>& speed, int distance) {
        int count = 1,n = position.size();
        for(int i=n-1;i>0;i--){
            if(speed[i]<speed[i-1]||position[i]-position[i-1]<=distance)
                speed[i-1] = speed[i];
            else 
                count++;
        }
        return count;
    }
};