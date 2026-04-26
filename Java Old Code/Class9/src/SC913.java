import java.io.*;
public class SC913
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int i = 1;
       while(i<=4)
       {
           int n = 0;
           int n95 = 0;
           i++;
           System.out.println("ENTER MARKS % FOR SECTION "+i+" :-");
           while(n<40)
           {
               System.out.println("ENTER YOUR MARKS %:-");
               int a = Integer.parseInt(dis.readLine());
               n95 += (a>=95)?1:0;
               n++;
           }
           System.out.println("NUMBER OF STUDENTS WHO GOT MORE THAN OR EQUAL TO 95% IS :- "+n95);
       }
    }
}
    