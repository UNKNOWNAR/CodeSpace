import java.io.*;
public class TicTacToe
{
    char computerCharacter;
    char playerCharacter=' ';
    void CharacterChoose() throws IOException
    {
        while (playerCharacter==' ')
        {
            System.out.println("Enter X or O you want to play with");
            DataInputStream dis = new DataInputStream(System.in);
            playerCharacter = dis.readLine().charAt(0);
            if(playerCharacter=='X')
                computerCharacter = 'O';
            else if(playerCharacter == 'O')
                computerCharacter = 'X';
            else {
                System.out.println("Wrong Input");
                playerCharacter = ' ';
            }
        }
    }
    char play[] = new char[9];
    TTTAI ai = new TTTAI(playerCharacter);
    void arr()
    {
        //displaing number in the array
        for(int i=0;i<9;i++)
            play[i] = (char)(i+49);
    }
    void fill()
    {
        //fill the array with blank space
        for(int i=0;i<9;i++)
            play[i] = ' ';
    }
    int input(int n) throws IOException
    {
        //input for multiplayer
        DataInputStream dis = new DataInputStream(System.in);
        if(n%2==0)
        {
            System.out.println("PLAYER 1 ENTER:-");
            int n1 = Integer.parseInt(dis.readLine());
            if(play[n1-1]==' ')
            {
                play[n1-1] = 'X';
                return (n-1);
            }
            else
            {
                System.out.println("WRONG INPUT.INPUT COINCIDING, INPUT AGAIN");
                return 10;
            }
        }
        else
        {
            System.out.println("PLAYER 2 ENTER:-");
            int n1 = Integer.parseInt(dis.readLine());
            if(play[n1-1]==' ')
            {
                play[n1-1] = 'O';
                return (n-1);
            }
            else
            {
                System.out.println("WRONG INPUT.INPUT COINCIDING, INPUT AGAIN");
                return 10;
            }
        }
    }
    int input() throws IOException
    {
        //input for single player
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("PLAYER ENTER:-");
        int n = Integer.parseInt(dis.readLine());
        if(play[n-1]==' ')
        {
            play[n-1] = playerCharacter;
            return (n-1);
        }
        else
        {
            System.out.println("WRONG INPUT.INPUT COINCIDING, INPUT AGAIN");
            return 10;
        }
    }
    void input(int f,int x,int n1)
    {
        //calling TTTAI
        int n = 0;
        int random = (int)(Math.random()*20)+1;
        if(n1==1)
            n=ai.Random(play);
        else if(n1==2&&random%2==0)
            n=ai.Random(play);
        else if(n1==3&&random%3==0)
            n=ai.Random(play);
        else
            n = ai.input(play,f,x);
        play[n] = computerCharacter;
    }
    char check()
    {
        int i = 0;
        //check for vertical column
        while(i<3)
        {
            if(play[i]==play[i+3]&&play[i]==play[i+6]&&play[i]!=' ')
                return play[i];
            i++;
        }
        i = 0;
        //check for horizontal row
        while(i<7)
        {
            if(play[i]==play[i+1]&&play[i]==play[i+2]&&play[i]!=' ')
                return play[i];
            i+=3;
        }
        i = 0;
        //checks for diagonal checking
        int d = 4;
        while(d!=1)
        {
            if(play[i]==play[i+d]&&play[i]==play[i+2*d])
                return play[i];
            i+=2;
            d/=2;
        }
        return 'n';
    }
    void display()
    {
        //display the tic tac toe background
        int a=2,b=4,k=0;
        for(int j=1;j<=11;j++)
        {
            System.out.print("\t\t\t\t\t\t\t");
            if(j%4!=0)
            {
                for(int i=1;i<=23;i++)
                {
                    if(i==b&&j==a)
                    {
                        System.out.print(play[k]);
                        b+=8;
                        k++;
                    }
                    else if(i%8==0)
                        System.out.print("|");
                    else
                        System.out.print(" ");
                }
            }
            else
            {
                for(int i=1;i<=23;i++)
                    System.out.print("-");
            }
            b=4;
            a += (j==a)?4:0;
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("\t\t\t\t\t\t\t  WELCOME TO TIC TAC TOE\n\n");
        int c = 5;
        while(c==5)
        {
            String result="GAME ON";
            TicTacToe ob = new TicTacToe();
            ob.arr();
            System.out.println("PRESS 1 FOR MULTIPLAYER AND 2 FOR SINGLE PLAYER");
            int choice = Integer.parseInt(dis.readLine());
            System.out.println("Press the Number to Put the Symbol on the Spot");
            ob.display();
            ob.fill();
            int i = 0;
            if(choice==1)
            {
                while(i<9)
                {
                    int n = ob.input(i);
                    ob.display();
                    if(n!=10)
                        i++;
                    if(i>=4)
                    {
                        if(ob.check()=='X')
                        {
                            System.out.println("Player 1 Won,Congratulations");
                            result="Player 1 Won";
                            break;
                        }
                        else if(ob.check()=='O')
                        {
                            System.out.println("Player 2 Won,Congratulations");
                            result="Player 2 Won";
                            break;
                        }
                    }
                }
                if(result=="GAME ON")
                    System.out.println("Well Played Player 1 and Player 2, The Game is a Draw");
            }
            else if(choice==2)
            {
                System.out.println("Enter 1 for Easy Mode,2 for Medium mode,3 for Hard Mode and 4 for Impossible Mode");
                int n1 = Integer.parseInt(dis.readLine());
                int r = (int)(Math.random()*(2)+1);
                if(r==1)
                    System.out.println("Computer's First Move");
                else
                    System.out.println("Player's First Move");
                ob.CharacterChoose();
                System.out.println("Choice is:-"+r);
                int n = -1;
                while(i<9)
                {
                    if(((i%2)+r)==2)
                    {
                        n = ob.input();
                        ob.display();
                        if(n!=10)
                            i++;
                        else
                            continue;
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("MOVE BY COMPUTER");
                        System.out.println();
                        ob.input(r,n,n1);
                        ob.display();
                        i++;
                    }
                    if(i>4)
                    {
                        if(ob.check()== ob.computerCharacter)
                        {
                            result="Computer Won";
                            System.out.println("Computer Won");
                            break;
                        }
                        else if(ob.check()== ob.playerCharacter)
                        {
                            result= "Congratulations,Player  Won";
                            System.out.println("Congratulations,Player  Won");
                            break;
                        }
                    }
                }
                if(result=="GAME ON")
                    System.out.println("The Game is a Draw");
            }
            System.out.println("ENTER 5 to Continue and any Number to Quit");
            c = Integer.parseInt(dis.readLine());
        }
        System.out.println("Thanks for Playing the Game");
    }
}