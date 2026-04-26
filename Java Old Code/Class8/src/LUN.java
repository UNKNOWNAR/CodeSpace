 import java.io.*;
public class LUN
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER ANY CHARECTER:-");
       char a = dis.readLine().charAt(0);
       if ( a >= 'A' && a <= 'Z')
       {
           System.out.println(a+"is a upper class charecter");
      }
      else if ( a >= 'a' && a <= 'z')
      {
       System.out.println(a + "is a lower class charecter");    
      }
      else if (a >= '1' && a <= '9')
      {
          System.out.println(a + "is a number"); 
        }
    }
}
          
      
     
       