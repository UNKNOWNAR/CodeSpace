/*Write a menu driven program to input two positive numbers m and n (where m>n) and perform the following tasks:
(a) Find the sum of two numbers without using '+' operator.
(b) Find the product of two numbers without using '*' operator.
(c) Find the quotient and remainder of two numbers without using '/' and '%' operator.*/
import java.io.*;
public class SC15
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int a = 5;
       while(a==5)
       {
               int i =0,sum = 0,product =0,r=0;
              System.out.println("Enter 1 for sum,2for product,3 for quotent and remainder:-");
              int x = Integer.parseInt(dis.readLine());
              System.out.println("Enter Number:-");
              int n = Integer.parseInt(dis.readLine());
              System.out.println("Enter Number:-");
              int n1 = Integer.parseInt(dis.readLine());
                 switch(x)
              {
                  case 1:
                  n1 = -n1;
                  sum = n - n1;
                  System.out.println("Sum:- " +sum);
                  break;
                  case 2:
                  while(n1!=0)
                  {  
                      product += n;
                      n1--;
                  }
                  System.out.println("Product:- "+product);
                  break;
                  case 3:
                  r = n % n1;
                  n = n - r;
                   while(n!=0)
                  {
                      n= n - n1;
                      i++;
                  }
                   System.out.println("Quotent:- "+i);
                   System.out.println("Remainder:- "+r);
                   break;
                   default: 
                   System.out.println("WRONG INPUT");
            }
            System.out.println("Enter 5 to continue or press any text to escape:-");
            a = Integer.parseInt(dis.readLine());
       }
}
}
       