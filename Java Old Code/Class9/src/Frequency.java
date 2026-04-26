/*Write a C program to find frequency of each digit in a given integer.*/
import java.io.*;
public class Frequency
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       int a=0,b=0,c=0,d=0,e=0,f=0,g=0,i=0,h=0,m=n;
       while(n>0)
       {
           int r = n%10;
           a = (r==1)?a+1:a+0;
           b = (r==2)?b+1:b+0;
           c = (r==3)?c+1:c+0;
           d = (r==4)?d+1:d+0;
           e = (r==5)?e+1:e+0;
           f = (r==6)?f+1:f+0;
           g = (r==7)?g+1:g+0;
           h = (r==8)?h+1:h+0;
           i = (r==9)?i+1:i+0;
           n=n/10;
       }
       if(a>0)
       {
           System.out.println("Frequency of 1 in "+m+" is "+a);
       }
       if (b>0)
       {
           System.out.println("Frequency of 2 in "+m+" is "+b);
       }
       if(c>0)
       {
           System.out.println("Frequency of 3 in "+m+" is "+c);
       }
       if(d>0)
       {
           System.out.println("Frequency of 4 in "+m+" is "+d);
       }
       if(e>0)
       {
           System.out.println("Frequency of 5 in "+m+" is "+e);
       }
       if(f>0)
       {
           System.out.println("Frequency of 6 in "+m+" is "+f);
       }
       if(g>0)
       {
           System.out.println("Frequency of 7 in "+m+" is "+g);
       }
       if(h>0)
       {
            System.out.println("Frequency of 8 in "+m+" is "+h);
       }
       if(c>0)
       {
            System.out.println("Frequency of 9 in "+m+" is "+i);  
       }
}
}

