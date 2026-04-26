import java.io.*;
public class EncodeDecocde
{
    String code(String s)
    {
        int l = s.length();
        String str = "";
        for(int i=0;i<l;i++)
        {
            int n = (int)s.charAt(i);
            int f = 0;
            if(n<65||n>122||n<90&&n>97)
            {
                str += (char)n;
                continue;
            }
            if(n<97)
            {
                f++;
                n+=32;
            }
            n=2*97+25-n;
            if(f!=0)
                n=n-32;
            str+=(char)n;
        }
        return str;
    }
    public static void main(String args)throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the code:-");
        String str = dis.readLine();
        EncodeDecocde ob = new EncodeDecocde();
        str = ob.code(str);
        System.out.println("Encoded Code:- "+str);
        str = ob.code(str);
        System.out.println("Decoded Code:- "+str);
    }
}
        