class Solution {
public:
    int minMoves(vector<int>& nums) {
        int moves = 0;
        int min_val = *min_element(nums.begin(),nums.end());
        for(int num:nums)
            moves += num-min_val;
        return moves;
    }
};