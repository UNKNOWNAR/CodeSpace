class Solution {
    using ll = long long;
public:
    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(),position.end());
        ll low = 1,high = *max_element(position.begin(),position.end());
        while(low<=high){
            ll mid = low+(high-low)/2;
            if(check(mid,position,m))
                low = mid+1;
            else
                high = mid-1;
        }
        return high;
    }
    bool check(ll min_force,vector<int>& position, int m){
        int count = 1;
        int prev = position[0];
        for(int i=1;i<position.size();i++){
            if(position[i]-prev>=min_force){
                count++;
                prev = position[i];
            }
            if(count==m)    return true;
        }
        return false;
    }
};