/*Consider the following statement:
"26 January is celebrated as the Republic Day of India"

Write a program (using scanner class) to change 26 to 15; January to August; Republic to Independence and finally print as:

"15 August is celebrated as the Independence Day of India"*/
import java.io.*;
public class SC1113
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number Of Students:- ");
       String str = dis.readLine();
       str += " ";
       String word = "";
       int l = str.length();
       for(int i=0;i<l;i++)
       {
                char ch = str.charAt(i);
                if(ch!=' ')
                {
                    word = word + ch;
                }
                else 
                {
                    if(word.equals("26"))
                    {
                      System.out.print("15 ");
                    }
                    else if(word.equals("January"))
                    {
                      System.out.print("August ");
                    }
                    else if(word.equals("Republic"))
                    {
                      System.out.print("Independence ");
                    }
                    else
                    {
                        System.out.print(word+" ");
                    }
                    word= "";
                }
       }
        }
    }
