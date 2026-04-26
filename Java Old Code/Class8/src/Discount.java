import java.io.*;
public class Discount
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER  NUMBER OF ITEMS");
       double l = Integer.parseInt(dis.readLine());
       l = l * 100;
       if(l>1000)
       {
          l = l * 0.90;
        }
        System.out.println("TOTAL PRICE :-" + l);
    }
}