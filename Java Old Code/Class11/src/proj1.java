import java.io.*;
public class proj1
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter a Character:- ");
        char ch = dis.readLine().charAt(0);
        if(Character.isUpperCase(ch))
            System.out.println(ch+" is Upper Case");
        else if(Character.isLowerCase(ch))
            System.out.println(ch+" is Lower Case");
        else if(Character.isDigit(ch))
            System.out.println(ch+" is a Number");
        else if(!Character.isWhitespace(ch))
            System.out.println(ch+" is a Character");
    }
}