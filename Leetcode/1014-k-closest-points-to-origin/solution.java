class Solution {
    private int distance0(int x,int y){
        return x*x+y*y;
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((indx1,indx2)->distance0(points[indx2][0],points[indx2][1])-distance0(points[indx1][0],points[indx1][1]));

        for (int i = 0; i < points.length; i++) {
            maxHeap.add(i);

            if(maxHeap.size()>k)
                maxHeap.poll();
        }

        int result[][] = new int[k][2];

        while(maxHeap.size()!=0){
            int indx = maxHeap.poll();
            result[k-1][0] = points[indx][0];
            result[k-1][1] = points[indx][1];
            k--;
        }
        return result;
    }
}
