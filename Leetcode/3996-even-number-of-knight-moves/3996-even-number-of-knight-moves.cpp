class Solution {
public:
    bool canReach(vector<int>& start, vector<int>& target) {
        //knight moves from white->black->white so in every moves it changes its colors
        //color of a cell is detremined by(x+y) if even then black if odd then white
        return ((start[0]+start[1])&1)==((target[0]+target[1])&1);
        //so if color are same then even number of moves if different then odd numebr of moves
    }
};