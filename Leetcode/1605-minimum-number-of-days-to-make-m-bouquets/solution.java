class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) 
            return -1;
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int flower:bloomDay){
            low = Math.min(low,flower);
            high = Math.max(high,flower);
        }
        while(low<=high){
            int mid = low + ((high-low)>>1);
            if(possible(bloomDay,m,k,mid))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    private boolean possible(int[] bloomDay, int m, int k,int days){
        int Bloom = 0;
        int count = 0;
        for(int flower:bloomDay){
            if(flower<=days)
                count++;
            else{
                Bloom += count/k;
                count=0;
            }
        }
        Bloom += count/k;
        if(Bloom>=m)    return true;
        return false;
    }
}
