import java.util.Scanner;
public class series353
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER THE NUMBER:-");
          int a  = in.nextInt();  
          int sum = 0;
          for(int i = 1;a==0;i++)
          {
              a=a/10;
              System.out.print(sum+" ");
          }
          switch(sum)
          {
              case 1:
              System.out.print("One Digit Number");
              break;
              case 2:
              System.out.print("Two Digit Number");
              break;
              case 3:
              System.out.print("Three Digit Number");
              break;
              default:
              System.out.print("More than Three Digit Number");
           }
        }
    }