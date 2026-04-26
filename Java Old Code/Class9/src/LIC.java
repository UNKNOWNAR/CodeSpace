/*A company announces revised Dearness Allowance (DA) and Special Allowances (SA) for their employees as per the tariff given below:

Basic	Dearness Allowance (DA)	Special Allowance (SA)
Up to ₹ 10,000	10%	5%
₹ 10,001 - ₹ 20,000	12%	8%
₹ 20,001 - ₹ 30,000	15%	10%
₹ 30,001 and above	20%	12%
Write a program to accept name and Basic Salary (BS) of an employee. Calculate and display gross salary.
Gross Salary = Basic + Dearness Allowance + Special Allowance
Print the information in the given format:
Name    Basic    DA    Spl. Allowance    Gross Salary
  xxx        xxx      xxx            xxx                      xxx*/
  import java.io.*;
public class LIC
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER YOUR NAME:-");
       String name= dis.readLine();
       System.out.println("ENTER SUM:-");
       double sum = Double.parseDouble(dis.readLine());
       System.out.println("ENTER ANUAL PREMIUM:-");
       double ap = Double.parseDouble(dis.readLine());
       double dios = 0;
       double com =0;
       double t = 0;
       if(sum <= 100000)
           {
               dios = (ap * 5 )/100;
               com = (sum*2)/100;
           }
           else if(sum >= 100001 &&  sum <= 200000)
           {
               dios = (ap * 8 )/100;
               com = (sum*3)/100;
           }
           else if(sum >= 200001 && sum <= 500000)
           {
               dios = (ap * 10 )/100;
               com = (sum*5)/100;
           }
           else
           {
               dios = (ap * 15 )/100;
               com = (sum*7.5)/100; 
           }
           System.out.println("NAME OF POLICY HOLDER:-"+name);
           System.out.println("SUM ASSURED:- "+sum);
           System.out.println("PREMIUM:-"+ap);
           System.out.println("DISCOUNT ON THE FIRST PREMIUM:-"+dios);
           System.out.println("COMMISSION OF THE AGENT:-"+com);
        }
    }