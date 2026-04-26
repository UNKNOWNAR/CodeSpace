import java.util.Scanner;
public class Program_2
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER 1 TO PRINT THE FLOYD'S TRIANGLE AND 2 TO PRINT THE PATTERN");
          int a  = in.nextInt();
          switch(a)
          {
              case 1:
              int i = 1;
              int j = 1;
              int k = 1;
              while(k<=5)
              {
                  System.out.println();
                  while(j<=k)
                  {
                      System.out.print(i+" ");
                      i++;
                      j++;
                  }
                  j=1;
                  k++;
              }
              break;
              case 2:
              String b = "ICSE";
              char c = ' ';
              k=1;
              i=0;
              j=1;
              while(k<=4)
              {
                  System.out.println();
                  while(j<=k)
                  {
                     c = b.charAt(i);
                     System.out.print(c);
                     j++;
                     i++;
                   }
                  j=1;
                  i=0;
                  k++;
              }
              break;
              default:
              System.out.println("INVALID INPUT");
            }
        }
    }