/*Write a program by using a class in Java with the following specifications:
Class name — Stringop
Data members:
String str
Member functions:
Stringop() — to initialize str with NULL
void accept() — to input a sentence
void encode() — to replace and print each character of the string with the second next character in the ASCII table.
 For example, A with C, B with D and so on
void print() — to print each word of the String in a separate line*/
import java.io.*;
public class Stringop
{
    String str;
    Stringop ()
    {
        str = "";
    }
    public void accept() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter a sentence: ");
        str = dis.readLine();
    }
    public void encode()
    {
        int i = 0;
        String str2 = "";
        while(i<str.length())
        {
            char ch = str.charAt(i);
            int c = ch+2;
            ch =(char) c;
            str2 += ch;    
            i++;
        }
        System.out.println("Encoded Sentence");
        System.out.println(str2);
    }
    public void print()
    {
        int i = 0;
        str += " ";
        String word ="";
        while(i<str.length())
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                System.out.println(word);
                word = "";
            }
            else 
                word += ch;
            i++;
        }
    }
    public static void main(String args[])throws IOException
    {
        Stringop obj = new Stringop();
        obj.accept();
        obj.encode();
        obj.print();
    }
}