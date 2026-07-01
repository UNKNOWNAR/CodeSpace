class Solution {
    private int stack[];
    private int top=0;
    private boolean visited[];
    private boolean pathvisited[];
    private boolean hasCycle;
    int numCourses;
    List<List<Integer>> graph = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        visited = new boolean[numCourses];
        pathvisited = new boolean[numCourses];
        stack = new int[numCourses];
        this.numCourses = numCourses;

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) 
            graph.get(pre[1]).add(pre[0]);
        
        for(int i=0;i<numCourses;i++){
            if(!visited[i])
                dfs(i);
        }
        if(hasCycle)
            return new int[0];
        return stack;
    }
    public void dfs(int indx){
        visited[indx]=true;
        pathvisited[indx]=true;
        for(int j=0;j<graph.get(indx).size();j++){
            if(!visited[graph.get(indx).get(j)])
                dfs(graph.get(indx).get(j));
            else if(visited[graph.get(indx).get(j)]&&pathvisited[graph.get(indx).get(j)]){
                hasCycle = true;
                return;
            }
        }
        if(hasCycle)
            return;
        pathvisited[indx]=false;
        stack[numCourses-++top] = indx;
    }
}
