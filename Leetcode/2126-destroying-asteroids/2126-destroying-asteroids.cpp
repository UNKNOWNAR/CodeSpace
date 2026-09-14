class Solution {
    using ll = long long;
public:
    bool asteroidsDestroyed(int mass, vector<int>& asteroids) {
        sort(asteroids.begin(),asteroids.end());
        ll totalMass = mass;
        for(int m:asteroids){
            if(totalMass>=m)
                totalMass += m;
            else
                return false;
        }
        return true;
    }
};