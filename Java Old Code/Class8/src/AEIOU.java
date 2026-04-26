import java.io.*;
public class AEIOU
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("What would you like to print:-");
       char a = dis.readLine().charAt(0);
       if (a == 'a'|| a=='A' || a =='e'|| a == 'E' || a == 'i' || a == 'I' || a =='o' || a =='O' || a == 'u' || a == 'U')
       {
          System.out.println(a+" is a vouvel");
        }
else
{
    System.out.println(a+" is a conusunent");
}
}
}