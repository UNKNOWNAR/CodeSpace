/*Instance variable 
int pan to store pan number
String name to store name
Double tax income
To store anual taxable income
Double tax 
To store tax that is calculated
Member Function
Input() store the pan number and taxable income
Calc() calculate tax for an employe
Display
Output details
Upto 1,00,000 no tax
Upto 1,00,000 -1,50,000  10% exceeding 1,00,000
Upto 1,50,000 -2,50,000 lac 5000 and 20% exceeding 1,50,000
Above 2,50,000 lac 25000 +30%of income 2,50,000 lac */
import java.util.*;
public class Employee
{
   int pan;
   String name;
   Double tax_income;
   Double tax; 
   Employee()
   {
      int pan=0;
      String name="";
      double tax_income=0.0;
      double tax=0.0;
   }
   void input()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER YOUR NAME, THE PAN NUMBER and TAXABLE INCOME:- ");
       name = sc.nextLine();
       pan = sc.nextInt();
       tax_income = sc.nextDouble();
   }
   void calculate()
   {
       if(tax_income<100000)
       {
           tax = 0.0;
       }
       else if(tax_income<150000&&tax_income>100000)
       {
           tax = (tax_income-100000)*0.1;
       }
       else if(tax_income<250000&&tax_income>150000)
       {
           tax = (tax_income-150000)*0.2+5000;
       }
       else if(tax_income>250000)
       {
           tax = (tax_income-250000)*0.3+25000;
       }
   }
   void display()
   {
       System.out.print("PAN NUMBER:- "+ pan +"\nNAME:- "+name+"\nTAX:- "+ tax);
   }
   public static void main(String args[])
   {
       Employee e = new Employee();
       e.input();
       e.calculate();
       e.display();
   }
}
   