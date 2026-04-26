import java.io.*;
public class Conscharecter
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A String:- ");
        String str = dis.readLine();
        System.out.println("Enter A Charecter:- ");
        char ch = dis.readLine().charAt(0);
        int l = str.length();
        int f = 0;
        for(int i=0;i<l-1;i++)
        {
            char c = str.charAt(i);            
            if(ch==c && ch == str.charAt(i+1))
            {
                int j = 0;
                for(j=i+2;j<l;j++)
                {
                    c = str.charAt(j);
                    if(ch!=c)
                        break;
                }
                System.out.println(str.substring(i,j));
                System.exit(0);
            }
        }
    }
}