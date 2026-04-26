import java.io.*;
public class TerneryDetails1
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis  = new DataInputStream(System.in);
       System.out.println("ENTER valu of a");
       int a = Integer.parseInt(dis.readLine());
            
     
     System.out.println((a>0)?a+"Is a positive number":a+"Is a negative number");
       
    
}
}
        
   
