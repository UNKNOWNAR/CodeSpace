import java.io.*;
public class CopyOfLARGESTNUMBER
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       
       System.out.println("ENTER A NUMBER");
       int max = Integer.parseInt(dis.readLine());
       for(int i = 1;i<3;i++)
       {
        System.out.println("ENTER A NUMBER");
       int c = Integer.parseInt(dis.readLine()); 
       int b =(c>max)?c:max;
       max=b;
       
           
       
      
    }
        System.out.println("THE LARGEST NUMBER IS :-"+max);
    
}
}
        
   
