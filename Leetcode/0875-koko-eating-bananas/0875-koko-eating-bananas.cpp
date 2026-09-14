class Solution {
    using ll = long long;
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        ll low = 1;
        ll high = *max_element(piles.begin(),piles.end());
        while(low<=high){
            ll mid = low + (high-low)/2;
            if(check(mid,piles,h))
                high = mid-1;
            else
                low = mid+1;
        }   
        return low;
    }
    bool check(ll speed,vector<int>& piles, int h){
        ll time = 0;
        for(ll pile:piles){
            time += (pile + speed - 1) / speed;
            if (time > h) return false;
        }
        return true;
    }
};