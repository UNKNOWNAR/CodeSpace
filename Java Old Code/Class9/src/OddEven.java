import java.io.*;
public class OddEven
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       if((a%2)==0)
       {
           if (a>100)
           {
               a = a*a;
                System.out.println("It is an even and its square is :-"+a);
            }
            else
            {
                a = a*a*a;
                 System.out.println("It is an even and its cube:-"+a);
            }
       }
       else
       {
            if (a>10)
            {
                 System.out.println(a+"is a odd number and its value is greater than 10");
            }
            else
            {
                System.out.println(a+"is a odd number and its value is lesser than 10");
            }
        }
    }
}