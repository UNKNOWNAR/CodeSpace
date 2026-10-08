class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int l = 0,ans = 1,n = fruits.size();
        map<int,int> mp;
        for(int r=0;r<n;r++){
            mp[fruits[r]]++;
            while(mp.size()>2){
                mp[fruits[l]]--;
                if(!mp[fruits[l]])
                    mp.erase(fruits[l]);
                l++;
            }
            if(mp.size()<=2)
                ans = max(ans,r-l+1);
        }
        return ans;
    }
};