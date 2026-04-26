import java.io.*;
public class SALARY
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("WHAT IS YOUR SALARY ?");
       double s = Integer.parseInt(dis.readLine());
       System.out.println("FOR HOW MANY YEARS YOU ARE WORKING ?");
       int y = Integer.parseInt(dis.readLine());
       if(y>5)
       {
           s = s * 105 / 100;
           System.out.println("SALARY :-" + s);
        }
        else
        {
            
        System.out.println("SALARY :-" + s);
        }
    }
}
