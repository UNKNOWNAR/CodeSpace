class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        int n = asteroids.size();
        stack<int> st;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
                continue;
            }
            while(!st.empty()&&st.top()>0&&st.top()<abs(asteroids[i]))
                st.pop();
            if(st.empty()||st.top()<0)
                st.push(asteroids[i]);
            if(!st.empty()&&st.top()==abs(asteroids[i]))
                st.pop();
        }
        vector<int> ans(st.size());
        int indx = st.size()-1;
        while(!st.empty()){
            ans[indx--] = st.top();
            st.pop();
        }
        return ans;
    }
};