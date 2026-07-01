class Solution {
    class Pair{
        int weight;
        int next;
        Pair(int weight,int next){
            this.weight = weight;
            this.next = next;
        }
    }
    int dist[];
    List<List<Pair>> adjList;
    int n;
    public int minCost(int n, int[][] edges) {
        dist = new int[n];
        adjList = new ArrayList<>();
        this.n = n;
        for(int i=0;i<n;i++){
            List<Pair> temp = new ArrayList<>();
            adjList.add(temp);
            dist[i] = Integer.MAX_VALUE;
        }
        for(int edge[]:edges){
            adjList.get(edge[0]).add(new Pair(edge[2],edge[1]));
            adjList.get(edge[1]).add(new Pair(2*edge[2],edge[0]));
        }
        dist[0] = 0;
        implementDijkstra();
        return (dist[n-1]==Integer.MAX_VALUE)?-1:dist[n-1];
    }
    private void implementDijkstra(){
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair temp =  pq.poll();
            int distance = temp.weight;
            int node = temp.next;
            List<Pair> temp1 = adjList.get(node);
            for(int i=0;i<temp1.size();i++){
                if(dist[temp1.get(i).next]>distance+temp1.get(i).weight){
                    dist[temp1.get(i).next]=distance+temp1.get(i).weight;
                    pq.add(new Pair(distance+temp1.get(i).weight,temp1.get(i).next));
                }
            }
        }
    }
}
