import java.util.Scanner;
public class Program14
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER VALUE OF x:-");
          int x  = in.nextInt();
          System.out.println("ENTER VALUE OF n:-");
          int n  = in.nextInt();
          double sum = 0;
          int i=1,j=2;
          while(i<=n)
          {
              sum += (Math.pow((x+i),i+1));
              i++;
            }
          System.out.println(sum);  
        }
    }