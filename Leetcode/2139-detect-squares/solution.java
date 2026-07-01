class DetectSquares {
    // Using a simple HashMap with a bit-packed Integer key (x << 10 | y)
    // Coordinates are up to 1000, so 10 bits (up to 1024) is enough.
    Map<Integer,Integer> map;
    List<int[]> points;
    public DetectSquares() {
        map = new HashMap<>();
        points = new ArrayList<>();
    }
    
    public void add(int[] point) {
        int key = (point[0] << 10) | point[1];
        map.put(key,map.getOrDefault(key,0)+1);
        points.add(point);
    }
    
    public int count(int[] point) {
        int x1 = point[0];
        int y1 = point[1];
        int count = 0;
        for (int[] p : points) {
            int x3 = p[0];
            int y3 = p[1];
            if(Math.abs(x1-x3)==Math.abs(y1-y3)&&Math.abs(x1-x3)>0){
                int p2Key = (x1 << 10) | y3;
                int p4Key = (x3 << 10) | y1;
                int p3Key = (x3 << 10) | y3;

                count += map.getOrDefault(p2Key,0)*map.getOrDefault(p4Key,0);
            }
        }
        return count;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */
