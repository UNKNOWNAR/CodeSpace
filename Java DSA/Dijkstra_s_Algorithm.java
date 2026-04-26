import java.util.*;

public class Dijkstra_s_Algorithm {
    // Function to construct adjacency list from edge list
    public ArrayList<ArrayList<ArrayList<Integer>>> constructAdj(int[][] edges, int V) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Initialize adjacency list with empty lists
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Fill adjacency list: undirected graph, so add edges both ways
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            // u → v
            ArrayList<Integer> e1 = new ArrayList<>();
            e1.add(v);
            e1.add(wt);
            adj.get(u).add(e1);

            // v → u
            ArrayList<Integer> e2 = new ArrayList<>();
            e2.add(u);
            e2.add(wt);
            adj.get(v).add(e2);
        }

        return adj;
    }

    // Function to perform Dijkstra's algorithm
    public int[] dijkstra(int V, int[][] edges, int src) {
        // Build adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = constructAdj(edges, V);

        // Distance array: store shortest distances from src
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Priority queue to select vertex with minimum distance
        // Each element: [current_distance, vertex]
        PriorityQueue<ArrayList<Integer>> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.get(0)));

        // Start with source vertex
        ArrayList<Integer> start = new ArrayList<>();
        start.add(0);   // distance
        start.add(src); // vertex
        pq.offer(start);

        while (!pq.isEmpty()) {
            ArrayList<Integer> curr = pq.poll();
            int currentDist = curr.get(0);
            int u = curr.get(1);

            // Visit all neighbors of u
            for (ArrayList<Integer> neighbor : adj.get(u)) {
                int v = neighbor.get(0);
                int weight = neighbor.get(1);

                // If shorter path found
                if (dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;

                    // Add to priority queue
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(dist[v]);
                    temp.add(v);
                    pq.offer(temp);
                }
            }
        }

        return dist;
    }

    // Driver function
    public static void main(String[] args) {
        int V = 5;  // Number of vertices
        int src = 0; // Source vertex

        int[][] edges = {
            {0, 1, 2},
            {0, 2, 4},
            {1, 2, 1},
            {1, 3, 7},
            {2, 3, 3},
            {2, 4, 5},
            {3, 4, 1}
        };

        Dijkstra_s_Algorithm obj = new Dijkstra_s_Algorithm();

        int[] distances = obj.dijkstra(V, edges, src);
        System.out.println("Shortest distances from vertex " + src + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To vertex " + i + " : " + distances[i]);
        }
    }
}
