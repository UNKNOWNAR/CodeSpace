class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0;i<height.length-1;i++)
        {
            if(height[i]==0)
                continue;
            int j = height.length-1;
            while((j-i)>(max/height[i]))
            {
                int area = (j-i)*((height[i]<height[j])?height[i]:height[j]);
                max=(area>max)?area:max;
                j--;
            }
        }
        return max;
    }
}
