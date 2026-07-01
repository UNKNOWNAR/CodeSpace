class Solution {
    boolean ans = true;
    public boolean isBipartite(int[][] graph) {
        int colorNode[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(colorNode[i]==0)
                dfs(i,1,graph,colorNode);
        }
        return ans;
    }
    public void dfs(int indx,int color,int[][] graph,int colorNode[]){
        colorNode[indx] = color;
        color = 3-color;
        for(int i=0;i<graph[indx].length;i++){
            if(colorNode[graph[indx][i]]==0)
                dfs(graph[indx][i],color,graph,colorNode);
            else if(colorNode[graph[indx][i]]==3-color)
                ans = false;
            if(!ans)
                return;
        }
    }
}
