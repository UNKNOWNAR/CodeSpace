import java.io.*;
public class Revision
{
    public static void main ( String args [] )throws IOException
    {
        DataInputStream dis = new DataInputStream( System.in);
        char c;
        System.out.println("Enter the charecter:-");
        c  = (char)dis.read();
        
        if ( c>='a' && c <= 'z')
        {
            System.out.println(" It is a upper case ");
        }
                if ( c>='A' && c <= 'Z')
        {
            System.out.println(" It is a lower case ");
       
    }
            if ( c>= 0 && c <= 9)
        {
            System.out.println(" It is a umber ");
       
}
}
}
    
