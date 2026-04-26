import java.io.*;
public class Conversion
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("TYPE DB TO CONVERT DECIMAL TO BINARY AND BD TO CONVERT BINARY TO DDECIMAL");
       String a = dis.readLine();
       switch(a)
       {
           case "DB":
           System.out.println("Enter Value in Decimal");
           int d = Integer.parseInt(dis.readLine());
           int b=0,r=0;
           while(d>0)
           {
               r = d % 2;
               d = d / 2;
               b = b*10+r;
            }
           System.out.println("Value in Binary "+b);
           break;
           case "BD":
           System.out.println("Enter Value in Binary");
           b = Integer.parseInt(dis.readLine());
           d=0;
           double i=0;
           while(b>0)
           {
              int dig = b % 10;
              d = d + (int)(Math.pow(2,i)*dig);
              i++;
              b = b /10;
           }
           System.out.println("Value in Decimal "+d);
           break;
           case "DO":
           System.out.println("Enter Value in Decimal");
           d = Integer.parseInt(dis.readLine());
           int o=0;r=0;
           while(d>0)
           {
               r = d % 8;
               d = d / 8;
               o = o*10+r;
            }
           int o1 = 0 ;
           while( o  > 0)
           {
                 int b1 = o % 10;
                 o = o /10;
                 o1 = o1 * 10 + b1; 
              }
           o = o1;   
           System.out.println("Value in Octal "+o);
           break;
           case "OD":
           System.out.println("Enter Value in Octal");
           o = Integer.parseInt(dis.readLine());
           d=0;
           i=0;
           while(o>0)
           {
              int dig = o % 10;
              d = d + (int)(Math.pow(8,i)*dig);
              i++;
              o = o /10;
           }
           System.out.println("Value in Octal "+d);
           break;
           case "BO":
           System.out.println("Enter Value in Binary");
           b = Integer.parseInt(dis.readLine());
           d=0;
           i=0;
           while(b>0)
           {
              int dig = b % 10;
              d = d + (int)(Math.pow(2,i)*dig);
              i++;
              b = b /10;
           }
            o=0;r=0;
           while(d>0)
           {
               r = d % 8;
               d = d / 8;
               o = o*10+r;
            }
           o1 = 0 ;
           while( o  > 0)
           {
                 int b1 = o % 10;
                 o = o /10;
                 o1 = o1 * 10 + b1; 
              }
           o = o1;   
           System.out.println("Value in Octal "+o);
           break;
           case "OB":
           System.out.println("Enter Value in Octal");
           o = Integer.parseInt(dis.readLine());
           d=0;
           i=0;
           while(o>0)
           {
              int dig = o % 10;
              d = d + (int)(Math.pow(8,i)*dig);
              i++;
              o = o /10;
           }
           b=0;r=0;
          while(d>0)
          {
               r = d % 2;
               d = d / 2;
               b = b*10+r;
            }
           System.out.println("Value in Binary "+b);
           break;
        }
    }
}