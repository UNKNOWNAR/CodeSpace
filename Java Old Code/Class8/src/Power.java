import java.io.*;
public class Power
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("ENTER THE VALUE OF BASE");
        float a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER THE VALUE OF THE EXPONENT");
       float b = Integer.parseInt(dis.readLine());
       float c = 1 ;
       if ( b < 0 )
           {
              float  d = - b ;
            
            for (float i =1;i<=d;i++)
            {
               c = c * a;
            }
        
             float e = 1 / c ;
            
            System.out.println("Value is " + e);
        }
        else 
        {
       for (float i =1;i<=b;i++)
       {
           c = c * a ;
           
        }
        
    
        System.out.println( "Value is " + c );
    }
    }
    }

