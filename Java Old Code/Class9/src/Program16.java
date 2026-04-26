import java.util.Scanner;
public class Program16
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER Number:-");
          int n  = in.nextInt();
          int i = n,sumd = 0,prod=1;
          while(n>0)
          {
              int d = n%10;
              n = n /10;
              sumd += d;
              prod *= d;
          }
          System.out.println((i==sumd+prod)?i+" is a special two digit number":i+" is not a special two digit number");
        }
    }
    