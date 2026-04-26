import java.io.*;
public class Novcsc
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A String:- ");
        String str = dis.readLine();
        int l = str.length();
        int c1=0,c2=0,s=0;
        for(int i=0;i<l;i++)
        {
            char c = str.charAt(i);
            if(Character.isUpperCase(c))
                c1++;
            else if(Character.isLowerCase(c))
                c2++;
            else if(!Character.isDigit(c))
                s++;
        }
        System.out.println("Number of Upper Case Character:- "+c1);
        System.out.println("Number of Lower Case Character:- "+c2);
        System.out.println("Number of Special Character:- "+s);
    }
}