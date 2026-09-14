class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int left = 0,right = n-1,area = 0;
        while(left<right){
            int h = min(height[left],height[right]);
            area = max(area,h*(right-left));
            if(height[right]>height[left])
                left++;
            else
                right--;
        }
        return area;
    }
};