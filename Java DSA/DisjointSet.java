import java.util.*;
public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer>   size = new ArrayList<>();
    public DisjointSet(int n) {
        for(int i=0; i<=n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUParent(int p) { // find ultimate parent
        if(p == parent.get(p)) return p;
        int ulp = findUParent(parent.get(p));
        parent.set(p, ulp);
        return ulp;
    }

    public void unionbyRank(int p, int q) { // union by Rank
        int ulp_p = findUParent(p);
        int ulp_q = findUParent(q);
        if(ulp_p == ulp_q)
            return;
        if(rank.get(ulp_p) < rank.get(ulp_q))
            parent.set(ulp_p, ulp_q);
        else if(rank.get(ulp_p) > rank.get(ulp_q))
            parent.set(ulp_q, ulp_p);
        else {
            parent.set(ulp_q, ulp_p);
            rank.set(ulp_p, rank.get(ulp_p)+1);
        }
    }

    public void unionbySize(int p, int q) {
        int ulp_p = findUParent(p);
        int ulp_q = findUParent(q);
        if(ulp_p == ulp_q)
            return;
        else if (size.get(ulp_p) > size.get(ulp_q)) {
            parent.set(ulp_q, ulp_p);
            size.set(ulp_p, size.get(ulp_p)+size.get(ulp_q));
        }
        else {
            parent.set(ulp_p, ulp_q);
            size.set(ulp_q, size.get(ulp_p)+size.get(ulp_q));
        }
    }

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionbyRank(1, 2);
        ds.unionbyRank(2, 3);
        ds.unionbyRank(4, 5);
        ds.unionbyRank(6, 7);
        ds.unionbyRank(5, 6);

        if(ds.findUParent(3) == ds.findUParent(7))
            System.out.println("Same");
        else
            System.out.println("Different");

        ds.unionbyRank(3, 7);

        if(ds.findUParent(3) == ds.findUParent(7))
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}