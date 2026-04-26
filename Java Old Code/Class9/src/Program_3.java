import java.util.Scanner;
public class Program_3
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER NUMBER:-");
          int a  = in.nextInt(),n=0,c=a;
          while(a!=0)
          {
              int b = a % 10;
              a = a /10;
              n = n*10;
              n+= b;
          }
          System.out.println((n==c)?c+" is a palindrome number":c+" is not a palindrome number");
        }
    }