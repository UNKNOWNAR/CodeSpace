import java.util.Scanner;
public class ProgramS24
{
    public static void main(String args[])
    {
          int n=5,i = 5;
          while(n>0)
          {
              while(i<=5)
              {
                  System.out.print(i);
                  i++;
              }
              System.out.println();
              n--;
              i=n;
          }
        }
    }