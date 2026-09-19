class Solution {
public:
    int xc,yc;
    bool checkOverlap(int radius, int cx, int cy, int x1, int y1, int x2, int y2) {
        xc = cx;
        yc = cy;
        int closx,closy;

        if (x1 > cx) closx = x1;
        else if (x2 < cx) closx = x2;
        else closx = cx;
        
        if (y1 > cy) closy = y1;
        else if (y2 < cy) closy = y2;
        else closy = cy;

        int dx = closx-cx;
        int dy = closy-cy;

        return dx*dx + dy*dy <= radius*radius; 
    }
};