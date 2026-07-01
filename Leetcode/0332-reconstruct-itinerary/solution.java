class Solution {
    // PriorityQueue keeps destinations lexicographically sorted
    Map<String, PriorityQueue<String>> adj = new HashMap<>();
    LinkedList<String> ans = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        // 1. Build the graph
        for (List<String> t : tickets) {
            adj.computeIfAbsent(t.get(0), k -> new PriorityQueue<>()).add(t.get(1));
        }
        
        // 2. Start DFS from JFK
        dfs("JFK");
        return ans;
    }

    private void dfs(String src) {
        PriorityQueue<String> destinations = adj.get(src);
        
        // 3. Visit destinations in lexicographical order
        while (destinations != null && !destinations.isEmpty()) {
            // poll() "uses up" the ticket so we don't visit it again
            dfs(destinations.poll());
        }
        
        // 4. Post-order: add to front of list
        ans.addFirst(src);
    }
}
