class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int alt = 0,highest = 0;
        for(auto &h:gain){
            alt += h;
            highest = max(highest,alt);
        }
        return highest;
    }
};
