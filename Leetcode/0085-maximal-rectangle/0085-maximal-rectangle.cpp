class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        stack<int> st;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            while(!st.empty()&&heights[st.top()]>heights[i]){
                int indx = st.top();
                st.pop();
                int nse = i;
                int pse = st.empty()?-1:st.top();
                maxArea = max(maxArea,heights[indx]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.empty()){
            int nse = n;
            int indx = st.top();
            st.pop();
            int pse = st.empty()?-1:st.top();
            maxArea = max(maxArea,heights[indx]*(nse-pse-1));
        }
        return maxArea;
    }
    int maximalRectangle(vector<vector<char>>& matrix) {
        if(matrix.empty() || matrix[0].empty())
            return 0;
        int m = matrix.size(),n = matrix[0].size();
        vector<vector<int>> prefixMatrix(m,vector<int>(n));
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum += matrix[j][i]-'0';
                if(matrix[j][i]=='0')   sum = 0;
                prefixMatrix[j][i] = sum;
            }
        }
        int maxArea = 0;
        for(int i=0;i<m;i++)
            maxArea = max(maxArea,largestRectangleArea(prefixMatrix[i]));
        return maxArea;
    }
};