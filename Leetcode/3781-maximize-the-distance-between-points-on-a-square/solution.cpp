class Solution {
    using ll = long long;
public:
    bool check(vector<ll>& doubled,int n,int k,int side,int mid){
        ll perimeter = 4ll*side;
        for(int i=0;i<n;i++){
            int count = 1;
            int idx = i;
            ll lastPos = doubled[idx];
            for(int j=2;j<=k;j++){
                ll target = lastPos + mid;
                auto it = lower_bound(begin(doubled)+idx+1,begin(doubled)+i+n,target);
                if(it==begin(doubled)+i+n)  break;
                idx = it - begin(doubled);
                lastPos = doubled[idx];
                count++;
            }
            if(count==k && (doubled[i]+perimeter-lastPos>=mid))
                return true;
        }
        return false;
    }
    ll get1D(int side,int x,int y){
        if(y==0)    return x;
        if(x==side) return side+y;
        if(y==side)     return 3ll*side-x;
        return 4ll*side-y;
    }
    int maxDistance(int side, vector<vector<int>>& points, int k) {
        int n = points.size();
        ll perimeter = 4ll*side;
        vector<ll> positions(n);
        for(int i=0;i<n;i++)
            positions[i] = get1D(side,points[i][0],points[i][1]);
        sort(positions.begin(),positions.end());

        //double the positions array to easily handle the circular access of the square perimeter
        vector<ll> doubled(2*n);
        for(int i=0;i<n;i++){
            doubled[i] = positions[i];
            doubled[i+n] = positions[i] + perimeter;
        }
        ll low = 0;
        ll high = 2*side;
        ll ans = 0;
        while(low<=high){
            ll mid = (low+high)>>1;
            vector<int> chosen;
            if(check(doubled,n,k,side,mid)){
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }
};
