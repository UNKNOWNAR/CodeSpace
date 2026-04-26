/*Given below is a hypothetical table showing rate of income tax for an India citizen, who is below or up to 60 years.

Taxable income (TI) in ₹	Income Tax in ₹
Up to ₹ 2,50,000	Nil
More than ₹ 2,50,000 and less than or equal to ₹ 5,00,000	(TI - 1,60,000) * 10%
More than ₹ 5,00,000 and less than or equal to ₹ 10,00,000	(TI - 5,00,000) * 20% + 34,000
More than ₹ 10,00,000	(TI - 10,00,000) * 30% + 94,000
Write a program to input the name, age and taxable income of a person. If the age is more than 60 years then display the message "Wrong Category". If the age is less than or equal to 60 years then compute and display the income tax payable along with the name of tax payer, as per the table given above.*/
import java.io.*;
public class Tax
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER YOUR AGE :-");
       int age = Integer.parseInt(dis.readLine());
       System.out.println("ENTER YOUR NAME :-");
       int name = Integer.parseInt(dis.readLine());
       System.out.println("ENTER YOUR TAXIABLE INCOME:-");
       int sum = Integer.parseInt(dis.readLine());
       if(age>60)
       {
           System.out.println("WRONG CATEGORY");
       }
       else
       {
           if(sum <= 250000)
           {
               System.out.println("Income tax is zero");
           }
           else if(sum <= 250000 &&  sum >= 500000)
           {
               System.out.println("Income tax is "+((sum - 160000) * 10 / 100));
           }
           else if(sum <= 500000 && sum >= 1000000)
           {
               System.out.println("Income tax is "+(34000 + ((sum - 500000) * 20 / 100)));
           }
           else
           {
               System.out.println("Income tax is "+ (94000 + ((sum - 1000000) * 30 / 100)));
           }
        }
    }
}