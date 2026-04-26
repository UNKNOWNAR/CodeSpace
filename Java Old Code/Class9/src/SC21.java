/*Using switch statement, write a menu driven program to:
(a) find and display all the factors of a number input by the user ( including 1 and the excluding the number itself).
Example: Sample Input : n = 15
               Sample Output : 1, 3, 5
(b) find and display the factorial of a number input by the user (the factorial of a non-negative integer n, denoted by n!, is the product of all integers less than or equal to n.)
Example: Sample Input : n = 5
               Sample Output : 5! = 1*2*3*4*5 = 120
For an incorrect choice, an appropriate error message should be displayed.*/
import java.io.*;
public class SC21

{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int a = 5;
        while(a==5)
        {
            System.out.println("ENTER 1 TO FIND FACTORS OF A NUMBER, 2 TO FIND FACTORIALOF A NUMBER:- ");
            int x = Integer.parseInt(dis.readLine());
            System.out.println("ENTER A NUMBER:- ");
            int n = Integer.parseInt(dis.readLine());
        switch(x)
              {
               case 1:
               int pn = 2;
               System.out.print("1");
               while(pn!=(n-1))
               {
                   if (n%pn==0)
                   {
                       System.out.print(", "+pn);
                   }
                    pn++;
                }
                break;
                case 2:
                int f = 1,i = 1;
                while((n+1)!=i)
                {
                    f *= i;
                    i++;
                }
                System.out.println("Factorial of "+n+" is "+f);
                break;
                default: 
                System.out.println("WRONG INPUT");
            }
            System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
        }
    }
}