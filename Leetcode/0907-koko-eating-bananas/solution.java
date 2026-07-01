class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile:piles)
            high = Math.max(pile,high);
        while(low<=high){
            int mid = low + ((high-low) >> 1);
            if(countHours(piles,mid)<=h)
                high = mid-1;
            else 
                low = mid+1;
        }
        return low;
    }
    public long countHours(int piles[],int k){
        long hours = 0;
        for(int banana:piles)
            hours += Math.ceil((double)banana / k);
        return hours;
    }
}
