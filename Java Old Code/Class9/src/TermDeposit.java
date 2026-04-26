/* An employee wants to deposit certain sum of money under 'Term Deposit' scheme in Syndicate Bank. The bank has provided the tariff of the scheme, which is given below:

No. of Days	Rate of Interest
Up to 180 days	5.5%
181 to 364 days	7.5%
Exact 365 days	9.0%
More than 365 days	8.5%
Write a program to calculate the maturity amount taking the sum and number of days as inputs.*/
import java.io.*;
public class TermDeposit
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER NO OF DAYS :-");
       int nd = Integer.parseInt(dis.readLine());
       System.out.println("ENTER SUM :-");
       double sum = Double.parseDouble(dis.readLine());
       if(nd<=180)
           {
               System.out.println("Maturity Amount"+(sum*105.5)/100);
           }
           else if(nd <= 181 &&  nd >= 364)
           {
               System.out.println("Maturity Amount"+(sum*107.5)/100);
           }
           else if(sum == 365)
           {
               System.out.println("Maturity Amount"+(sum*109)/100);
           }
           else
           {
               System.out.println("Maturity Amount"+(sum*108.5)/100);
           }
        }
    }
    