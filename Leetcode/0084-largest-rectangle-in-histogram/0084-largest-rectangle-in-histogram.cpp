class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        vector<int> nse(n);
        vector<int> pse(n);
        stack<int> st;
        for(int i=0;i<n;i++){
            while(!st.empty()&&heights[st.top()]>=heights[i])
                st.pop();
            pse[i] = st.empty()?-1:st.top();
            st.push(i);
        }
        stack<int> s;
        for(int i=n-1;i>=0;i--){
            while(!s.empty()&&heights[s.top()]>=heights[i])
                s.pop();
            nse[i] = s.empty()?n:s.top();
            s.push(i);
        }
        int maxi = 0;
        for(int i=0;i<n;i++)
            maxi = max(maxi,heights[i]*(nse[i]-pse[i]-1));
        return maxi;
    }
};