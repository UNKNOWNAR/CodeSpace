public class CubeMoves {
    CubeMoves(char cube[][][],int facecolour,String move)
    {
        switch(move)
        {
            case "R1":
                RightMovesR1(cube[][][], facecolour);
        }
    }
    public void RightMovesR1(char cube[][][],int facecolour)
    {
        int rside = 0;
        int up = 0;
        int down = 0;
        if(facecolour==0)
        {
            rside = 1;
            up = 4;
            down = 5;
            
        }
    }
}