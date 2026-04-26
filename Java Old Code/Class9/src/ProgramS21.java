import java.util.Scanner;
public class ProgramS21
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
          }
          System.out.println((i%sumd==0)?i+" is a niven number":i+" is not a niven number");
        }
    }
    