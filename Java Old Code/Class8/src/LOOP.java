
import java.io.*;
public class LOOP
{
    public static void main (String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.println("Enter Number:-");
        double b = Double.parseDouble(dis.readLine());
        double s = 0;
       
   
        for (int i =1;i<=b;i++)
        {
            
            
             s = (s * 10)+1;
             System.out.println(s);
            
        }
        
    }
}

    