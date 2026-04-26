import java.util.Scanner;
public class Program11
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER NO OF DAYS AFTER BOOKS WERE RETURNED");
          int d  = in.nextInt();
          double fine = 0;
          if(d>0)
          {
              fine = (d>=5)?0.4*(5):0.4*(5-d);
              d = d- 5;
              if(d>0)
              {
                  fine += (d>=5)?0.65*5:0.65*(5-d);
                  d=d-5;
                  if(d>0)
                  fine += 0.8*d;
              }
          }
          System.out.println("FINE TO BE PAID:- "+fine);
        }
    }