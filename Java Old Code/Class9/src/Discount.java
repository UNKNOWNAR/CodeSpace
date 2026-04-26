/*'Kumar Electronics' has announced the following seasonal discounts on purchase of certain items.

Purchase Amount Discount on Laptop  Discount on Desktop PC
Up to ₹ 25000   0.0%    5.0%
₹ 25,001 to ₹ 50,000    5%  7.5%
₹ 50,001 to ₹ 1,00,000  7.5%    10.0%
More than ₹ 1,00,000    10.0%   15.0%
Write a program to input name, amount of purchase and the type of purchase (`L' for Laptop and 'D' for Desktop) by a customer. Compute and print the net amount to be paid by a customer along with his name.
(Net amount = Amount of purchase - discount)*/
import java.io.*;
public class Discount
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Amount");
       double A = Double.parseDouble(dis.readLine());
       System.out.println("TYPE L FOR LAPTOP AND C FOR CMPUTER");
       char a = dis.readLine().charAt(0);
       switch(a)
       {
           case 'L':
           if(A <= 25000)
           {
               System.out.println("NET AMOUNT"+(A));
           }
           else if(A <= 25001 &&  A >= 500000)
           {
               System.out.println("NET AMOUNT"+(A*95)/100);
           }
           else if(A <= 50001 && A >= 100000)
           {
               System.out.println("NET AMOUNT"+(A*925)/1000);
           }
           else
           {
               System.out.println("NET AMOUNT"+(A*90)/100);
           }
           break;
           case 'P':
           if(A <= 25000)
           {
               System.out.println("NET AMOUNT"+(A*95)/100);
           }
           else if(A <= 25001 &&  A >= 500000)
           {
               System.out.println("NET AMOUNT"+(A*925)/1000);
           }
           else if(A <= 50001 && A >= 100000)
           {
               System.out.println("NET AMOUNT"+(A*900)/1000);
           }
           else
           {
               System.out.println("NET AMOUNT"+(A*85)/100);
           }
           break;
           default:
           System.out.println("WRONG INPUT");
       }
        System.out.println("NAME:-ARINJAY SARKAR");
        System.out.println("NET AMOUNT:-"+A);
    }
}