/*Using scanner class, write a program to input a string and display all the tokens of the string which begin with a capital letter and end with a small letter.
Sample Input: The capital of India is New Delhi
Sample Output: The India New Delhi*/
import java.io.*;
public class SC1111
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number Of Students:- ");
       String str = dis.readLine();
       str += " ";
       int l = str.length();
       String word = "";
       for(int i=0;i<l;i++)
       {
           char ch = str.charAt(i);
           if(ch!=' ')
            {
                word += ch;
            }
            else
            {
                int l1= word.length();
                char chf = word.charAt(0);
                char chl = word.charAt(l1-1);
                int a = chf;
                int b = chl;
                if(a>=65&&a<=90&&b>=97&&b<=122)
                {
                    System.out.println(word+" ");
                }
                word="";
            }
        }
    }
}