import java.io.*;
public class WORD_EXTRACTION
{
    public static void main(String args)throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter a String:- ");
        String str = dis.readLine();
        str = str+" ";
        int p=0;
        while(p<str.length())
        {
            String str1 = str.substring(p,(str.indexOf(" ",p)));
            System.out.println(str1);
            p = str.indexOf(" ",p)+1;
        }
    }
}