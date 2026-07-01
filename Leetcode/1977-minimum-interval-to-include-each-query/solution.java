class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int[][] qWithIdx = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            qWithIdx[i][0] = queries[i];
            qWithIdx[i][1] = i;
        }
        Arrays.sort(qWithIdx, (a, b) -> Integer.compare(a[0], b[0]));

        int ans[] = new int[queries.length];
        Arrays.fill(ans,-1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int indx = 0;
        for(int query[]:qWithIdx){
            while(indx < intervals.length && intervals[indx][0] <= query[0]){
                if(intervals[indx][0]<=query[0])
                    pq.add(new int[]{intervals[indx][1]-intervals[indx][0]+1,intervals[indx][1]});
                indx++;
            }
            while(!pq.isEmpty()){
                int arr[] = pq.poll();
                if(arr[1]<query[0])
                    continue;
                ans[query[1]] = arr[0];
                pq.add(arr);
                break;
            }
        }
        return ans;
    }
}
