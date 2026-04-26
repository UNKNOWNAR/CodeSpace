import java.io.*;
public class ELECTICITYBILL
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the value of the unit ");
        float a =  Integer.parseInt(dis.readLine());
        if (a<=10)
        {
             double tc = a * 5 ;
             System.out.println("Your Electricity Bill is "+tc);
            }
           if ((a>10)&&(a<=100))
           {
               double e = a - 10 ;
               double ts = ((e*4)+(10*5));
               System.out.println("Your Electricity Bill is "+ts);
            }
            if (a>100)
            {
                double b = a -100;
                double te = ((a*5)+(b*3));
                System.out.println("Your Electricity Bill is "+te);
    }
    
}
}

