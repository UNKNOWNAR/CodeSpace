class Solution {
    public int minimumBoxes(int[] apples, int[] capacity) {
        Arrays.sort(capacity);
        int totalApples=0;
        for(int apple:apples)
            totalApples += apple;
        int count = 0;
        for(int i = capacity.length - 1; i >= 0; i--){
                totalApples -= capacity[i];
                count++;
            if(totalApples<=0)
                break;
        }
        return count;
    }
}
