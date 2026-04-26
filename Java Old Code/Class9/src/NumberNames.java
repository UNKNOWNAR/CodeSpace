/*Write a C program to enter a number and print it in words.*/
import java.io.*;
public class NumberNames
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       String a=" one ",x="",b=" two ",c=" three ",d=" four ",e=" five ",f=" six ",g=" seven ",i=" nine ",h=" eight ";
       String name="";
       while(n>0)
       {
           int r = n%10;
           switch (r)
           {
           case 1:
           x = a;
           break;
           case 2:
           x = b;
           break;
            case 3:
           x = c;
           break;
            case 4:
           x = d;
           break;
            case 5:
           x = e;
           break;
            case 6:
           x = f;
           break;
            case 7:
           x = g;
           break;
            case 8:
           x = h;
           break;
            case 9:
           x = i;
           break;
        }
           name = x + name;
           n=n/10;
       }
       System.out.println(name);
    }
}
