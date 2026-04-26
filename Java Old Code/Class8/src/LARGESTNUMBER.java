import java.io.*;
public class LARGESTNUMBER
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO TAKE INPUT");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER A NUMBER");
       int max = Integer.parseInt(dis.readLine());
       for(int i = 1;i<a;i++)
       {
        System.out.println("ENTER A NUMBER");
       int c = Integer.parseInt(dis.readLine()); 
       if (c>max)
       {
           max = c;
       
        } 
    }
        System.out.println("THE LARGEST NUMBER IS :-"+max);
    
}
}
        
   
