class Solution {
public:
    int maxDistance(string moves) {
        int x = 0;
        int y = 0;
        int wildcards = 0;
        for (char c : moves) {
            if (c == 'R') x++;
            else if (c == 'L') x--;
            else if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == '_') wildcards++;
        }
        int abs_x = (x < 0) ? -x : x;
        int abs_y = (y < 0) ? -y : y;
        return abs_x + abs_y + wildcards;
    }
};
