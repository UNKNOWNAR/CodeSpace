import java.io.*;
public class Switchcase
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO TAKE INPUT");
       int a = Integer.parseInt(dis.readLine());
       switch(a)
       {
           case 1: System.out.println("a is 1");
           break;
           case 2: System.out.println("a is 2");
           break;
           case 3: System.out.println("a  is 3");
           break;
           case 4: System.out.println("a   is 4");
           break;
           default: System.out.println("a is unkown");
        }
    }
}