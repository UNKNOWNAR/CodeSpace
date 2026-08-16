class Solution {
public:
    int nearestDrone(vector<vector<int>>& drones, vector<int>& target) {
        int indx = -1;
        int dist = 1e9;
        int i = 0;
        for(auto drone:drones){
            int man_hat = abs(drone[0]-target[0])+abs(drone[1]-target[1]);
            if(dist>man_hat&&man_hat<=drone[2]){
                dist = man_hat;
                indx = i;
            }
            i++;
        }
        return indx;
    }
};