import java.util.Scanner;
public class Program_5
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER SALE:-");
          int sale  = in.nextInt();
          double income = 550;
          if(sale>=8001&&sale<=9000)
              income+= 0.12*sale;
          else if(sale>=9001&&sale<=10000)
              income += 0.15*sale;
          else if(sale>=10001)  
              income += 0.18*sale+500;
          System.out.println(income);   
    }
}