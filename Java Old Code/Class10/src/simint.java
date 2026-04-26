/*WAP with main function and with following specification
 Clas name simint
 Data Members int p,double t,r,si
 Member Functions void accept-input p,t,r
 void calc-calc si
 void display-display the details
 */
import java.util.*;
public class simint
{
   int p;
   double t;
   double r;
   double si; 
   simint()
   {
      int p=0;
      double t =0.0;
      double r=0.0;
      double si=0.0;
   }
   void accept()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER THE PRINCIPLE AMOUNT, THE TIME and SIMPLE INTEREST:- ");
       p = sc.nextInt();
       t = sc.nextDouble();
       r = sc.nextDouble();
   }
   void calc()
   {
       si = (p*r*t)/100;
   }
   void display()
   {
       System.out.print("SIMPLE INTEREST:- "+ si +"\nFINAL AMOUNT:- "+(p+si));
   }
   public static void main(String args[])
   {
       simint e = new simint();
       e.accept();
       e.calc();
       e.display();
   }
}
   