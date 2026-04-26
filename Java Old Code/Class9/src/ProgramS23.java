import java.util.Scanner;
public class ProgramS23
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER Number:-");
          int n  = in.nextInt();
          double sum  = 0;
          double i = 1,f=0;
          while(f<n)
          {
              sum += (i/(i+1));
              i +=  2;
              f++;
          }
          System.out.println(sum);
    }
}