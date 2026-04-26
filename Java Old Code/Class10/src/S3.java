import java.io.*;
public class S3
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A String:- ");
        String str = dis.readLine();
        str = str+" ";
        int l = str.length();
        int n = 0;
        int maxl = 0;
        while(n<l)
        {
            int f = n;
            n = str.indexOf(" ",n)+1;
            int length = n-l-1;
            maxl = (maxl>length)?length:maxl;
        }
        System.out.println(maxl);
    }
}