import java.io.*;
public class Isomorphic
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter First String");
        String str = dis.readLine();
        System.out.println("Enter Second String");
        String str1 = dis.readLine();
        if(str.length()!=str1.length())
        {
            System.out.println(str+" and "+str1+" are not an Isomorphic String");
            System.exit(0);
        }
        int i=0;
        while(i<str.length())
        {
            char a = str.charAt(i);
            char b = str1.charAt(i);
            if(str.indexOf(a,i+1)!=str1.indexOf(b,i+1))
            {
                System.out.println(str+" and "+str1+" are not an Isomorphic String");
                System.exit(0);
            }
            else if(str.indexOf(a,i+1)==str1.indexOf(b,i+1)&&str.indexOf(a,i+1)>0)
            {
                int k = i;
                while(str.indexOf(a,k+1)>0)
                {
                    if(str.indexOf(a,k+1)!=str1.indexOf(b,k+1))
                    {
                        System.out.println(str+" and "+str1+" are not an Isomorphic String");
                        System.exit(0);
                    }
                    k++;
                }
            }
            i++;
        }
        System.out.println(str+" and "+str1+" are an Isomorphic String");
    }
}