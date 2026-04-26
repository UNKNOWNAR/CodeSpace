import java.util.Scanner;
public class Program13
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER Number:-");
          int n  = in.nextInt();
          int i = 1,sumf = 0;
          while(i<n)
          {
              sumf += (n%i==0)?i:0;
              i++;
          }
          System.out.println((n==sumf)?n+" is a perfect number":n+" is not a perfect number");
        }
    }
    