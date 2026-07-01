import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class Solution {
    private int[] parent;
    private List<TreeSet<Integer>> onlineNodes;
    private boolean[] isOnline;

    private int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }

    private void unionSet(int x, int y) {
        int a = find(x);
        int b = find(y);

        if (a != b) {
            if (onlineNodes.get(a).size() < onlineNodes.get(b).size()) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            
            parent[b] = a;

            onlineNodes.get(a).addAll(onlineNodes.get(b));
            onlineNodes.get(b).clear();
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        parent = new int[c + 1];
        isOnline = new boolean[c + 1];
        Arrays.fill(isOnline, true);
        
        onlineNodes = new ArrayList<>(c + 1);
        for (int i = 0; i <= c; i++) {
            parent[i] = i;
            TreeSet<Integer> set = new TreeSet<>();
            if (i > 0) { 
                set.add(i);
            }
            onlineNodes.add(set);
        }

        for (int[] conn : connections) {
            unionSet(conn[0], conn[1]);
        }

        List<Integer> results = new ArrayList<>();
        
        for (int[] query : queries) {
            int type = query[0];
            int x = query[1];

            if (type == 1) {
                if (isOnline[x]) {
                    results.add(x);
                } else {
                    int rootX = find(x);
                    
                    if (onlineNodes.get(rootX).isEmpty()) {
                        results.add(-1);
                    } else {
                        results.add(onlineNodes.get(rootX).first());
                    }
                }
            } else {
                if (isOnline[x]) {
                    isOnline[x] = false;
                    int rootX = find(x);
                    
                    onlineNodes.get(rootX).remove(x);
                }
            }
        }
        
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}
