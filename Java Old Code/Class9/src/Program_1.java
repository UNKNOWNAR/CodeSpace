import java.util.Scanner;
public class Program_1
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER NO OF HOURS OF WORK:-");
          int wh  = in.nextInt();
          System.out.println("ENTER THE RATE OF MONEY FOR EACH HOUR OF WORK:-");
          int r  = in.nextInt();
          double w  = ((40-wh)>0)?(r*wh):(r*40);
          wh-= 40;
          if(wh>=16)
          {
              int a = ((16-wh)>0)?(125*r*wh):(125*r*16);
              w+= a/100;
              wh-= 16;
              w+= 1.5*r*wh;
          }
          System.out.println("WEEKLY WAGE:- "+w);
        }
    }