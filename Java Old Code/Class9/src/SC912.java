/* Write a program to display all composite numbers from 1 to 100. A number is said to be a composite number, if it has two or more factords excluding 1 and the number itself.-/
 Sample Input: 6
 Sample Output: Factors of 6 are 2 and 3
 Hence, 6 is a composite number.
 */
import java.io.*;
public class SC912
{
    public static void main ( String args [])
    { 
       int n = 1;
       while(n<=100)
       {
           int i= 2,x=0,j=0,a=n;
           while(n>=i)
           {
               x = n % i;
               j = (x==0)?j+1:j+0;
               i++;
            }
           if(j>=2)
           {
               int b  = 2;
               System.out.print("Factors of "+n+" is ");
               while(b<=n)
               {
                   int c = n % b;
                   if (c==0)
                   {
                       System.out.print(b+", ");
                    }
                   b++;
                  }
                  System.out.println("");
           }
           n++;
       }
    }
}
