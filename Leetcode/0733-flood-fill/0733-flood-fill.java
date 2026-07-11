class Solution {
    int row,col,initialColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        row = image.length;
        col = image[0].length;
        if(image[sr][sc]==color)
            return image;
        initialColor = image[sr][sc];
        dfs(image,sr,sc,color);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int color){
        if(r<0||r>=row||c<0||c>=col||image[r][c]!=initialColor)
            return;
        image[r][c] = color;
        dfs(image,r+1,c,color);
        dfs(image,r-1,c,color);
        dfs(image,r,c+1,color);
        dfs(image,r,c-1,color);
    }
}