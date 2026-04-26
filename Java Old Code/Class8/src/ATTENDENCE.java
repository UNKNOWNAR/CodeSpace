import java.io.*;
public class ATTENDENCE
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("HOW MANY CLASSES WERE HELD:- ");
       double nc = Double.parseDouble(dis.readLine());
       System.out.println("WHAT IS YOUR ATTENDENCE:- ");
       double nac = Double.parseDouble(dis.readLine());
       System.out.println(" DO YOU HAVE ANY MEDICAL CAUSE ");
       char c = (char)dis.read();
       double a = (nac / nc) * 100 ;
       System.out.println(" YOUR ATTENDENCE IS " + a + "%"); 
       if(a < 75 )
       {
           if(c=='N')
           System.out.println("YOU CANNOT SIT FOR THE EXAM");
           else
           {
           System.out.println("YOU CAN SIT FOR THE EXAM");
        }
        }
        else 
        {
            System.out.println("YOU CAN SIT FOR THE EXAM");
        }
    }
}