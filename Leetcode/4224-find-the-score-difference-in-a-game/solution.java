class Solution {
    private class Player{
        boolean isActive;
        int score;
        Player(boolean isActive){
            score = 0;
            this.isActive = isActive;
        }
        void changeActivity(){
            isActive = !isActive;
        }
    }
    public int scoreDifference(int[] nums) {
        Player first = new Player(true);
        Player second = new Player(false);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                first.changeActivity();
                second.changeActivity();
            }
            if((i+1)%6==0){
                first.changeActivity();
                second.changeActivity();
            }
            if(first.isActive){
                first.score += nums[i];
            }
            else
                second.score += nums[i];
        }
        return first.score-second.score;
    }
}
