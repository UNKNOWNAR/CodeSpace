import java.io.*;
public class RandomItem
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Item");
       String i1= dis.readLine();
       int i = 5;
       while(i==5)
       {
           System.out.println("Enter the Item");
           String i2= dis.readLine();
           int r = (int)(Math.random()*2);
           i1=(r==0)?i1:i2;
           System.out.println("PRESS 5 TO CONTINUE TO STOP PRESS ANY OTHER VALUE");
           i=Integer.parseInt(dis.readLine());
        }
       System.out.println("THE FINAL ITEM IS:- "+i1);
    }
}