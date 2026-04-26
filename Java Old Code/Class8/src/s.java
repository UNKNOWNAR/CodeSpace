import java.io.*;
public class s
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY ROWS YOU WAN TO TAKE INPUT:-");
       int row = Integer.parseInt(dis.readLine());
       int n = row;
       for(int i=0;i<row;i++) 
       {
        
           for(int j=0;j<n;j++)
           {
               System.out.print("*");
              
            }
             n = n-1;
            System.out.println();
        }
       
       
        }
}
    
