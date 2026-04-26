/*Write a program by using scanner class to input principal (P), rate (R) and time (T). Calculate and display the amount and compound interest. The program terminates as soon as an alphabet is entered.
Use the formula:
A = P(1 + (R / 100))T
CI = A - P*/
import java.util.Scanner;
public class SC1114
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int b=5;
        while(b==5)
        {
            System.out.println("Enter Pricipal:- ");
            if(!in.hasNextDouble())
                System.exit(0);
            double p = in.nextDouble();
            System.out.println("Enter Rate:- ");
            if(!in.hasNextDouble())
                System.exit(0);
            double r = in.nextDouble();
            System.out.println("Enter Time:- ");
            if(!in.hasNextInt())
                System.exit(0);
            int t = in.nextInt(); 
            double a = p*(Math.pow(((100+r)/100),t));
            double ci = a-p;
            System.out.println("AMOUNT:- "+ci);
         }
    }
}