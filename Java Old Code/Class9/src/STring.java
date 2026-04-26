import java.io.*;
public class STring
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
               word = word + ch;
            }
            else 
            {
                System.out.println(word);
                word= "";
            }
           /*System.out.println(ch);*/
        }
    }
}
    
    
        