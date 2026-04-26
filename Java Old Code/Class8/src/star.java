import java.io.*;
public class star
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY ROWS YOU WAN TO TAKE INPUT:-");
       int row = Integer.parseInt(dis.readLine());
       for(int i=0;i<row;i++) 
       {
           int n=i+1;
           for(int j=0;j<n;j++) {
               System.out.print("*");
            }
            System.out.println();
        }
       
       
        }
}
    
