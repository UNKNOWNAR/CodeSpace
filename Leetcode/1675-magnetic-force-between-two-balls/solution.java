class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1]-position[0];//this is the maxm works for m = 2
        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(position,mid)>=m)
                low = mid+1;
            else 
                high = mid-1;
        }
        return high;
    }
    private int check(int[] position, int gap){
        int prev = position[0];
        int balls = 1;
        for(int i=1;i<position.length;i++){
            if(position[i]-prev>=gap){
                prev = position[i];
                balls++;
            }
        }
        return balls;
    }
}
