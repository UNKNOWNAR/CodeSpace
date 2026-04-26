import java.util.Scanner;
public class naturalno
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER NO OF NATURAL NO:-");
          int a  = in.nextInt();  
          int sum = 0;
          for(int i = 1;i<=a;i++)
          {
              sum += a*a;
          }
          System.out.println("SUM OF NATURAL NUMBERS");
    }
    } 