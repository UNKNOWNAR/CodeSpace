class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        int n = asteroids.size();
        stack<int> positive;
        stack<int> negative;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                positive.push(asteroids[i]);
                continue;
            }
            while(!positive.empty()&&positive.top()<abs(asteroids[i]))
                positive.pop();
            if(positive.empty())
                negative.push(asteroids[i]);
            if(!positive.empty()&&positive.top()==abs(asteroids[i]))
                positive.pop();
        }
        int siz = positive.size()+negative.size();
        vector<int> ans(siz);
        int indx = negative.size()-1;
        while(!negative.empty()){
            ans[indx--] = negative.top();
            negative.pop();
        }
        indx = siz-1;
        while(!positive.empty()){
            ans[indx--] = positive.top();
            positive.pop();
        }
        return ans;
    }
};