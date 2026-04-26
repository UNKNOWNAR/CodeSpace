/*Using switch statement, write a menu driven program for the following:
(b) To find and display the sum of the series given below:
S = x1 - x2 + x3 - x4 + x5 - ............ - x20; where x = 2
(a) To display the series:
1, 11, 111, 1111, 11111
For an incorrect option, an appropriate error message should be displayed.*/
import java.io.*;
public class SC24
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
                int sum = 1;
                x=1;
                System.out.print(sum);
                while(x<4)
                {
                    sum = sum* 10 + 1;
                    System.out.print(", "+sum);
                    x++;
                }
                System.out.println("");
                break;
                case 2:
                System.out.println("Enter Number:-");
                int n = Integer.parseInt(dis.readLine());
                double sum1 = 0;
                double i =1;
                while(i<=20)
                {
                    double b  = Math.pow(n,i);
                    sum1  = (i%2!=0)?sum1 + b:sum1 - b;
                    i++;
            }
            System.out.println("Sum :- "+sum1);
            break;
             default: 
               System.out.println("WRONG INPUT");
            }
            System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
        }
        }
    }

                    
            