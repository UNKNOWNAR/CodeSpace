import java.util.Scanner;
public class Program_4
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER VALUE OF x:-");
          int x  = in.nextInt();
          System.out.println("ENTER VALUE OF n:-");
          int n  = in.nextInt();
          double sum = 0;
          int f=1,i=2,j=2;
          while(i<=n)
          {
              while(j<=i)
              {
                  f = f*j; 
                  j++;
              }
              sum += (Math.pow(x,i))/f;
              i++;
            }
          System.out.println(sum);  
        }
    }