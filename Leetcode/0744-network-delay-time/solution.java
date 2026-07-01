class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList());
        }
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int[] time : times){
            adj.get(time[0]).add(new Node(time[1],time[2]));
        }
        dist[k-1] = 0;
        pq.add(new Node(k,0));
        while(!pq.isEmpty()){
            Node nd = pq.poll();
            int node = nd.node;
            int cost = nd.cost;
            for(Node adjN : adj.get(node)){
                int adjNode = adjN.node;
                int adjDist = adjN.cost;
                if(dist[adjNode-1] > adjDist + cost){
                    dist[adjNode-1] = adjDist+cost;
                    pq.add(new Node(adjNode,dist[adjNode-1]));
                }
            }
        }
        int max = 0;
        for(int d : dist){
            if(d == Integer.MAX_VALUE)
                return -1;
            max = Math.max(max, d);
        }
        return max;
    }
}
class Node{
    int node;
    int cost;
    Node(int n,int c){
        this.node = n;
        this.cost = c;
    }
}
