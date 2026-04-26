import java.io.*;
public class Series
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter value of n");
        int n = Integer.parseInt(dis.readLine());
        int a = 1 ;
        int s = 0 ;
        int j = 0 ;
        while (a <= n)
        {
            s = (a*a*a) - 1;
            a = a + 1 ;
            System.out.print(s+",");
            
        }
        
        }
    }
        