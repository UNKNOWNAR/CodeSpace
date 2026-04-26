/*Write a menu driven class to accept a number from the user and check whether it is a Palindrome or a Perfect number.
(a) Palindrome number: (A number is a Palindrome which when read in reverse order is same as in the right order)
Example: 11, 101, 151 etc.
(b) Perfect number: (A number is called Perfect if it is equal to the sum of its factors other than the number itself.)
Example: 6 = 1 + 2 + 3*/
import java.io.*;
public class SC16

{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int a = 5;
        while(a==5)
        {
            System.out.println("ENTER 1 TO CHECK PALINDROME NUMBER OR NOT, 2 TO CHECK PERFECT NUMBER OR NOT:- ");
            int x = Integer.parseInt(dis.readLine());
            System.out.println("ENTER A NUMBER:- ");
            int n = Integer.parseInt(dis.readLine());
            switch(x)
              {
               case 1:
               int j = 0 ;
               int c = n;
             while( n  > 0)
             {
                 int b = n % 10;
                 j = j * 10 + b;
                 n = n /10;
              }
             if ( c == j )
   
             {
                  System.out.println( j + " is a Palindrome number " );
             } 
             else 
             {
                  System.out.println( j + " is not a Palindrome number " );
             }
                 break;
                 case 2 :
                 int b= 0 ;
                 int i;
                 int f = 0 ;
                 for( i=1;i<=n-1;i++)
                 if(n%i == 0)
                  {
                        b = b + i;
                   }
                 if (  b == n)
                  {
                         System.out.println( n + " is a perfect number");
                   }
                  else
                  {
                         System.out.println( n + " is not a perfect number");
                   }
                   break;
                   default: 
                   System.out.println("WRONG INPUT");
}
             System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
       }
}                       
        }
    
