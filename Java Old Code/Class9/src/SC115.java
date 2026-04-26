/*Write a program to accept a sentenve in mixed case. Find the frequenvy of vowels in each word and print the words along with their frequenvies in separate lines.

Sample Input:
We are learning scanner class
Sample Output:
Word       Frequency of vowels
We           1
are           2
learning   3
scanner    2
class        1*/
import java.io.*;
public class SC115
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number Of Students:- ");
       String str = dis.readLine();
       str += " ";
       String word = "";
       int l = str.length(); 
       int i = 0,vc=0;
       System.out.println("WORD\tFREQUENCY OF VOWELS");
       while(i<l)
       {
           char c = str.charAt(i);
           if(c!=' ')
           {
               word = word + c;
               }
           else
           {
               System.out.print(word+"\t");
               int na = word.length();
               int nv = 0;
               int j = 0;
               while(j<na)
               {
                   char a = word.charAt(j);
                   nv += (a=='a')?1:0;
                   nv += (a=='A')?1:0;
                   nv += (a=='e')?1:0;
                   nv += (a=='E')?1:0;
                   nv += (a=='i')?1:0;
                   nv += (a=='I')?1:0;
                   nv += (a=='o')?1:0;
                   nv += (a=='O')?1:0;
                   nv += (a=='u')?1:0;
                   nv += (a=='U')?1:0;
                   j++;
               }
               System.out.println(nv);
               word="";
            }
               i++;
    }
}
}
               