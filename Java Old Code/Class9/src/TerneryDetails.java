import java.io.*;
public class TerneryDetails
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis  = new DataInputStream(System.in);
       System.out.println("ENTER valu of a");
       int a = Integer.parseInt(dis.readLine());
       /*System.out.println("ENTER A NUMBER");
       int max = Integer.parseInt(dis.readLine());*/
     
     int b = (a>10)?((a%2==0)?5:10):30;
     System.out.println((a>b)?a+"Is greater than " + b:b+" is grater than "+ a);
        System.out.println("B = "+b);
    
}
}
        
   
