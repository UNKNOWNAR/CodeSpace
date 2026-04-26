import java.io.*; 
 public class MULTIPLICATION1
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER SECOND NUMBER");
       int b = Integer.parseInt(dis.readLine());
       int c = 0;
       for (int i =1;i<=b;i++)
            {
              c = c + a; 
            }
            System.out.println(a+" * "+b+" = "+c );
        }
    }