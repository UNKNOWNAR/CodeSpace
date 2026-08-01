class Solution {
public:
    bool predictTheWinner(vector<int>& nums) {
        return maxScore1(0,nums.size()-1,0,0,0,nums);
    }
    bool maxScore1(int start,int end,int score1,int score2,int turn,vector<int>& nums){
        if(start>end)
            return score1>=score2;
        bool win = false;
        if(turn==0){//0 for player 1 and 1 for player 2
            //take from first
            win |= maxScore1(start+1,end,score1+nums[start],score2,(turn+1)%2,nums);
            //take from second
            win |= maxScore1(start,end-1,score1+nums[end],score2,(turn+1)%2,nums);
        }
        else{
            win = true;
            //take from first
            win &= maxScore1(start+1,end,score1,score2+nums[start],(turn+1)%2,nums);
            //take from second
            win &= maxScore1(start,end-1,score1,score2+nums[end],(turn+1)%2,nums);
        }
        return win;
    }
};