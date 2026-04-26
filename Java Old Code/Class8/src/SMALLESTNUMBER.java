import java.io.*;
public class SMALLESTNUMBER
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO TAKE INPUT");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER A NUMBER");
       int min = Integer.parseInt(dis.readLine());
       for(int i = 1;i<a;i++)
       {
        System.out.println("ENTER A NUMBER");
       int c = Integer.parseInt(dis.readLine()); 
       if(c<min)
       {
           min = c;
       
        } 
    }
        System.out.println("THE SMALLEST NUMBER IS :-"+min);
    
}
}
        
   
