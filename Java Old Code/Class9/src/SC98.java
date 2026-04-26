/*Write a program to input a number and perform the following tasks:
(a) to check whether it is a prime number or not
(b) to reverse the number
If the number as well as the reverse is also 'Prime' then display 'Twisted Prime' otherwise 'Not a twisted Prime'.
Sample Input: 167
Sample Output: 167 and 761 both are prime.
It is a 'Twisted Prime'.*/
import java.io.*;
public class SC98
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the Number:-");
        int n = Integer.parseInt(dis.readLine());
        int i= 1,x=0,j=0,a=n;
        while(n>=i)
        {
            x = n % i;
            j = (x==0)?j+1:j+0;
            i++;
        }
        if(j==2)
        {
            int v = 0 ;
            while( a  > 0)
            {
                int b = a % 10;
                a = a /10;
                v = v * 10 + b; 
            }
            i= 1;x=0;j=0;
            while(v>=i)
            {
               x = v % i;
               j = (x==0)?j+1:j+0;
               i++;
            }
            if (j==2)
            {
               System.out.println(n+" and "+v+ " both are prime");
               System.out.println("It is a Twisted Prime");
            }
            else
            {
                System.out.println("It is not a Twisted Prime");
            }
        }
        else 
        {
            System.out.println("It is not a Prime Number:-");
        }
        }
    }
