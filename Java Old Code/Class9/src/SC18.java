/*Write a menu driven program to perform the following tasks by using Switch case statement:
(a) To print the series:
0, 3, 8, 15, 24, ............ to n terms. (value of 'n' is to be an input by the user)
(b) To find the sum of the series:
S = (1/2) + (3/4) + (5/6) + (7/8) + ........... + (19/20)*/
import java.io.*;
public class SC18
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int a = 5;
        while(a==5)
        {
            System.out.println("ENTER 1 TO PRINT THE SERIES, 2 TO FIND THE SUM:- ");
            int x = Integer.parseInt(dis.readLine());
            switch(x)
              {
               case 1:
               System.out.println("ENTER A NUMBER:- ");
                 int n = Integer.parseInt(dis.readLine());
               x = 0;
               System.out.print(x);
               int i =3;a=1;
               while(a<n)
               {
                   a++;
                   x += i;
                   System.out.print(", "+x);
                   i += 2;
               }
               System.out.println("");
               break;
               case 2:
               x = 1;
               double sum = 0;
               while(x<=20)
               {
                   sum = sum + (x/(double)(x+1));
                   x += 2;
               }
               System.out.println(sum);
               break;
               default: 
               System.out.println("WRONG INPUT");
            }
            System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
        }
    }
}
                   
        
        