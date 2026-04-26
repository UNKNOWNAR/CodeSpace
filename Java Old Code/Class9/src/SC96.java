/*Write a menu driven program to display all prime and non-prime numbers from 1 to 100.
Enter 1: to display all prime numbers
Enter 2: to display all non-prime numbers
Hint: A number is said to be prime if it is only divisible by 1 and the number itself.*/
import java.io.*;
public class SC96
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int b = 5;
        while(b==5)
        {
       System.out.println("Enter 1: to display all prime numbers");
       System.out.println("Enter 2: to display all non-prime numbers");
       int a = Integer.parseInt(dis.readLine());
       int v = 1;
       int i= 1,x=0,j=0;
       switch(a)
       {
           case 1:
           while(v<=100)
           {
           int n = v;
           i = 1;x=0;j=0;
           while(n>=i)
           {
               x = n % i;
               j = (x==0)?j+1:j+0;
               i++;
           }
           v++;
            if (j==2)
           {
               System.out.println(n+ " is a prime number");
           }            
        }
           break;
           case 2:
           while(v<=100)
           {
           int n = v;
           i= 1;x=0;j=0;
           while(n>=i)
           {
               x = n % i;
               j = (x==0)?j+1:j+0;
               i++;
           }
           v++;
            if (j!=2)
           {
               System.out.println(n+ " is not a prime number");
           }           
           
        }
         break;
                default: 
                System.out.println("WRONG INPUT");
       }
       System.out.println("Enter 5 to continue or press any text to escape:-");
            b = Integer.parseInt(dis.readLine());
}
}
}