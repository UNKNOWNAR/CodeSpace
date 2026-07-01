class Solution {
public:
    int furthestDistanceFromOrigin(string moves) {
        int lCount = 0, rCount = 0, underscoreCount = 0;
        
        for (char c : moves) {
            if (c == 'L') lCount++;
            else if (c == 'R') rCount++;
            else underscoreCount++;
        }
        return abs(lCount - rCount) + underscoreCount;
    }
};
