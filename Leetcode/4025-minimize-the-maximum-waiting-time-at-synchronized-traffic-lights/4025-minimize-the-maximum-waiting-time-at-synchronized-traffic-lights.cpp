class Solution {
public:
    int minPenalty(int period, vector<int>& lights, vector<int>& arrivalTime) {
        int maxi = *max_element(lights.begin(),lights.end());
        int max_val = 0;
        for(auto &x:arrivalTime){
            if((x%period)>=maxi)
                max_val = max(period-(x%period),max_val);
        }
        return max_val;
    }
};