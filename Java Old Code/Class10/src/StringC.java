import java.io.*;
public class StringC
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A String:- ");
        String s = dis.readLine();
        int l = s.length();
        char m[] = new char[l];
        int k=0;
        for(int i=0;i<l;i++)
        {
            int freq = 0;
            int j = i;
            char ch =  s.charAt(i);
            int flag = 0;
            for(int a=0;a<=k;a++)
            {
                if(m[a]==ch)
                    flag++;
            }
            if(flag!=0)
                continue;
            m[k] = ch;
            k++;
            while(j>=0)
            {
                freq++;
                j = s.indexOf(ch,j+1);
            }
            System.out.println("FREQUENCY OF "+ch+" IS:- "+freq);
        }
    }
}   