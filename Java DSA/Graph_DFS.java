import java.util.*;
public class Graph_DFS {
    public void dfsRecursive(ArrayList<ArrayList<Integer>> adj, int indx,boolean[] visited,ArrayList<Integer> res) {
        visited[indx] = true;
        res.add(indx);
        for (int neighbor : adj.get(indx)) {
            if (!visited[neighbor]) {
                dfsRecursive(adj, neighbor, visited, res);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        for(int i = 0; i < visited.length; i++) {
            if(!visited[i])
                dfsRecursive(adj, i, visited, res);
        }
        return res;
    }
    public void  addEdge(ArrayList<ArrayList<Integer> > adj, int s, int t)
    {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }
    public static void main(String[] args) {
        Graph_DFS g = new Graph_DFS();
        int V = 6;
        // Create an adjacency list for the graph
        ArrayList<ArrayList<Integer> > adj
                = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define the edges of the graph
        int[][] edges
                = { { 1, 2 }, { 2, 0 }, { 0, 3 }, { 4, 5 } };

        // Populate the adjacency list with edges
        for (int[] e : edges) {
            g.addEdge(adj, e[0], e[1]);
        }

        ArrayList<Integer> res = g.dfs(adj);

        System.out.println("DFS traversal starting from node 0:");
        for (int node : res) {
            System.out.print(node + " ");
        }
    }
}
