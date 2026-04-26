import java.util.Scanner;
public class Program12
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER N");
          int n  = in.nextInt();
          int i = 0,a=n,j=1,k=j,f=1;
          while(f<=2*n-1)
          {
              System.out.println();
              while(a>=i)
              {
                  System.out.print(" ");
                  i++;             
              }
              while(k>0)
              {
                  System.out.print("*");
                  k--;
              }   
              j=(f<n)?j+2:j-2;
              a=(f<n)?a-1:a+1;
              i=0;
              k=j;
              f++;
          }
        }
    }