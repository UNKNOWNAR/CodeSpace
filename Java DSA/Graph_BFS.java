import java.util.*;
public class Graph_BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int i,boolean[] visited,ArrayList<Integer> ans) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            ans.add(curr);

            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return ans;
    }
    ArrayList<Integer> bfsDisconnected(
            ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();

        boolean[] visited = new boolean[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                bfs(adj, i, visited, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(4)));
        adj.add(new ArrayList<>(Arrays.asList(3, 5)));
        adj.add(new ArrayList<>(Arrays.asList(4)));

        Graph_BFS g = new Graph_BFS();
        ArrayList<Integer> ans = g.bfsDisconnected(adj);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
