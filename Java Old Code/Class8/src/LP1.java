import java.io.*;
public class LP1
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY NUMBERS YOU WANT TO TAKE INPUT");
       int a = Integer.parseInt(dis.readLine());
       int b = a % 4;
       int c = a % 100;
       int d = a % 400;
       if ( b == 0)
       {
           if (c == 0)
           { 
               if ( d==0  )
               {
                   
           System.out.println(a+"is a leap year");
        }
        else
        {
            System.out.println(a+"is not a leap year");
        }
    }
    else
    System.out.println(a+"is a leap year");
}
else
{
    System.out.println(a+"is not a leap year");
}
}
}

       