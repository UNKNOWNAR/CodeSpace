import java.io.*;
public class LARGESTANDSMALLESTNUMBER
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO TAKE INPUT");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER A NUMBER");
       int b = Integer.parseInt(dis.readLine());
       int c = b;
       for(int i = 1;i<a;i++)
       {
        System.out.println("ENTER A NUMBER");
       int d = Integer.parseInt(dis.readLine()); 
       if (d>b)
       {
           b = d;
       
        }
    if(d<c)
       { 
         c = d;
       
    }
}
        System.out.println("THE SMALLEST NUMBER IS :-"+c);
        System.out.println("THE LARGEST NUMBER IS :-"+b);
    

}
}
        
   
