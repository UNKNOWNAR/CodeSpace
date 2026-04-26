import java.io.*;
public class prac
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        String str = dis.readLine();
        int l = str.length();
        String rev = "";
        for(int i=0;i<l;i++)
        {
            char c= str.charAt(i);
            rev = c+rev;
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(i==0)
                {
                    System.out.print(str);
                    j=l-1;
                }
                else if(i==l-1)
                {
                    System.out.print(rev);
                    j=l-1;
                }
                else if(j==0)
                    System.out.print(str.charAt(i));
                else if(j==l-1)
                    System.out.print(rev.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}