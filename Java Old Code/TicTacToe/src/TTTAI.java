public class TTTAI
{
    int moveCount = 0;//this only counts move given by TTTAI and not by the player
    int n = 0;
    int playerslastMove = 0;
    int firstMove = 0;
    char characterbycomputer;
    char characterbyplayer;
    int playersFirstMove=-1;
    char preferredcharacter = characterbycomputer;//only evaluates the preferred character for win or loss first
    int corner[] = {0,2,6,8};
    TTTAI(char ch)
    {
        characterbyplayer = ch;
        characterbycomputer = (ch=='X')?'O':'X';
    }
    void reset1()
    {
        moveCount = 0;
        playerslastMove = 0;
        n = 0;
    }
    int tools(int k)//this is used to check for a win combination and store the starting value to go to all combination
    // of winning boxes
    {
        if(k==1||k==2||k==3)
            return 0;
        else if(k==4)
            return 1;
        else if(k==5||k==6)
            return 2;
        else if(k==7)
            return 3;
        else
            return 6;
    }
    int tools1(int k)//this is used to check for a win combination and store the increment value to go to all combination
    // of winning boxes
    {
        if(k==1)
            return 4;
        else if(k==2||k==7||k==8)
            return 1;
        else if(k==3||k==4||k==6)
            return 3;
        else
            return 2;
    }

    boolean cornercheck(int move)
    {
        int flag = 0;
        for(int i=0;i<4;i++)
        {
            if(corner[i]==move)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return  true;
        else
            return false;
    }

    int doublewinchecker(char movearray[],int n)
    {
        for(int i=0;i<9;i++)
        {
            if (movearray[i] == ' ')
            {
                movearray[i] = characterbycomputer;
                int temp = 0;
                if(n==1) 
                {
                    temp = pairCheck(movearray,1);
                    if(temp==-1) {
                        movearray[i] = ' ';
                        continue;
                    }
                    movearray[temp] = characterbyplayer;
                    preferredcharacter = characterbyplayer;
                }
                else if(n==0)
                    preferredcharacter = characterbycomputer;
                int result = pairCheck(movearray, 3);
                if(n==1)
                    movearray[temp] = ' ';
                if(result==690)
                {
                    result = pairCheck(movearray,2);//checks if player's win is possible
                    movearray[i] = ' ';
                    if(result!=69)
                        return i;
                }
                else if(n==1)
                {
                    movearray[i] = ' ';
                    return i;
                }
                movearray[i] = ' ';
            }
        }
        return -1;
    }
    int wingenerator(int movesavailaible[],char movearray[])
    {
        for (int available_move : movesavailaible) {
            if (movearray[available_move] == ' ') {
                movearray[available_move] = characterbycomputer;//temporarily putting computers move to check the chances
                int result = pairCheck(movearray, 0);//if result is 690 then win by the computer is not possible with
                // the next move if it is not 690 then win is possible in the next move so putting players character there
                // were if computer puts its character it would win
                if (result != 690) {
                    movearray[result] = characterbyplayer;//putting players character to see if player can win
                    int temp = pairCheck(movearray, 2);//temp has the value which tells if player wins or not
                    movearray[result] = ' ';
                    movearray[available_move] = ' ';
                    if (temp == 690)//temp is 690 means there is no position in which player wins the game so
                        // available_move is the correct move else if temp is with position then this current move makes
                        // computer loose as in the next move player can win by matching three boxes
                        return available_move;
                }
                movearray[available_move] = ' ';
            }
        }
        return -1;
    }
    int pairCheck(char[] play,int n)//checks for two character for win case and then stop player from winning
    {//it checks if two characters are in such position that another move could lead to a win and then gives position of
        // third move accordingly
        String encode ="";//to get (character,index) of all pair and check first for win case and then stop player from winning
        for(int k=1;k<=8;k++)
        {
            int x = tools(k);//stores the starting value for win check
            int c = tools1(k);//adds specific number to calculate position of winning combination of characters
            int sum = 0;//calculates all sum of win combination
            int sum1 = 0;//calculates where third move could be placed
            int y = 0;//it checks if same two characters are present so that we can find where third character must be
            // placed to win or top player from winning
            int f =0;
            char previousCharacter = '@';//temporarily store this character it can be any character
            while(f!=3)
            {
                sum+=x;
                previousCharacter = (y==0)?play[x]:previousCharacter;
                if(play[x]!=' '&&play[x]==previousCharacter)
                {
                    sum1 +=x;
                    y++;
                }
                f++;
                x+=c;
            }
            sum1 = sum - sum1;
            if(y==2&&play[sum1]==' ') {
                if(previousCharacter==characterbycomputer&&n==0)
                    return sum1;//giving specific code for wingenerator which means move is available and good to go
                    // with the next case of pair checker
                else if (previousCharacter==characterbyplayer&&n==2) {
                    return 69;//in this case player wins
                } else if(n%2==1)//if both player and computer win is possible then it stores that character and index
                    // in string format to be worked on later in the code
                    encode += previousCharacter + Integer.toString(sum1);
            }
        }
        if(n%2==0)//for n=0&n=2
            return 690;//no win case could be generator next one
        int l = encode.length();
        if(n==3)
        {
            int flag = 0;
            for(int i=0;i<l;i+=2)
            {
                if(encode.charAt(i)==preferredcharacter)
                    flag++;
            }
            if(flag==2)
                return 690;//true
        }
        else if(l>1&&n==1)
        {
            int last = 0;
            for(int i=0;i<l;i+=2)
            {
                if (encode.charAt(i) == characterbycomputer)
                    return Character.getNumericValue(encode.charAt(i + 1));
                else
                    last = i;
            }
            return Character.getNumericValue(encode.charAt(last + 1));
        }
        return -1;
    }
    int controller(char play[])
    {
        //checks and looks for pair win first then save the game and creates a win condition
        int z = pairCheck(play,1);
        if(z!=-1)//first time it checks for win
            return z;
        z = doublewinchecker(play,1);
        if(z!=-1)
            return z;
        z = Random(play);
        return z;
    }
    int firstmove()
    {
        moveCount++;
        if(cornercheck(playersFirstMove))
            return 4;
        else//randomly assigns one of the corner to start the game by the computer
        {
            firstMove = ((int)(Math.random()*4)+1);
            firstMove = corner[firstMove-1];
            return  firstMove;
        }
    }
    int Random(char play[])
    {
        int b = 0;
        int rand[] = new int[9];
        for(int z=0;z<9;z++)
            rand[z] = -1;//-1 is used as filler
        b = 0;
        for(int i=0;i<9;i++)
        {
            if(play[i]==' ')
            {
                rand[b] = i;
                b++;
            }
        }
        int j = (int)(Math.random()*(b)+1);
        moveCount++;
        return(rand[j-1]);
    }
    int input(char play[],int choice,int lastMove)
    {
        if(choice==2)
            return second(play, choice,lastMove);
        else
            return first(play, choice);
    }
    int first(char play[],int choice)
    {
        if(moveCount==0)//assigning the first default position
            return firstmove();
        else if(moveCount>1&&n==2)
            return controller(play);
        else if(play[4]==' '||n==1)
        {
            //if player doesn't use center spot to give a move then a win is confirm
            n = 1;
            moveCount++;
            return fwin1(play);
        }
        else if(play[4]!=' ')
        {
            //if player gives a move at the centre spot takes on a path where victory might be possible but more draw chance
            n=2;
            moveCount++;
            return 8-firstMove;
        }
        return 0;
    }
    int fwin1(char play[])
    {
        if(moveCount==2)//if player doesn't use center then you can win by plating somewhere in the corner
            return wingenerator(corner,play);//move available is only in the corner to win
        else if(moveCount==3)
        {
            //checks if player made a mistake and gives a move there to win
            int move = pairCheck(play,1);
            n=2;//this makes the next move to be given by controller method
            if(move!=-1)
                return move;
            //checks if for where double win is possible
            return doublewinchecker(play,0);
        }
        return 0;
    }
    int second(char play[],int n,int lastMove)
    {
        if(moveCount==0)//GIVES FIRST MOVE
        {
            playersFirstMove = lastMove;
            return firstmove();
        }
        moveCount++;
        if(cornercheck(playersFirstMove)&&moveCount==1)
            return doublewinchecker(play, 1);
        //checks and allots position for computer to win
        return controller(play);
        //gives moves all the time
    }
}