import java.io.*;
public class StringSort
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A String:- ");
        String str = dis.readLine();
        int l = str.length();
        char c[] = new char[l];
        for(int i=0;i<l;i++)
            c[i] = str.charAt(i);
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(c[j]>c[j+1])
                {
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        str = "";
        for(int i=0;i<l;i++)
            str += c[i];
        System.out.println(str);
    }
}