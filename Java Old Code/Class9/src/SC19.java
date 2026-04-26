/*Using a switch statement, write a menu driven program to:
(a) Generate and display the first 10 terms of the Fibonacci series
0, 1, 1, 2, 3, 5
The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two.
(b) Find the sum of the digits of an integer that is input.
Sample Input: 15390
Sample Output: Sum of the digits = 18
For an incorrect choice, an appropriate error message should be displayed.*/
import java.io.*;
public class SC19

{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int a = 5;
        while(a==5)
        {
            System.out.println("ENTER 1 TO PRINT THE SERIES, 2 FIND THE SUM OF THE DIGITS:- ");
            int x = Integer.parseInt(dis.readLine());
        switch(x)
              {
                case 1:
                System.out.print("0, 1");
                 int fbv = 0,fbv1 = 1;
                 int v=8;
                 while(v>0)
                 {
                    fbv1 = fbv + fbv1;
                    fbv = fbv1 - fbv;
                    System.out.print(", "+fbv1);
                    v--;
                  }
                System.out.println("");  
                break;
                case 2:
                int sum = 0;
                System.out.println("ENTER A NUMBER:- ");
                int n = Integer.parseInt(dis.readLine());
                while(a>0)
                {
                    a = n%10;
                    sum += a;
                    n = n / 10;
                }
                System.out.println("Sum of Digits " + " = " + sum);
                break;
                default: 
                System.out.println("WRONG INPUT");
            }
            System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
        }
    }
}
