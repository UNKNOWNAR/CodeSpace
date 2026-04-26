/*Write a program in Java to find the sum of the given series :
(a) 1 + 4 + 9 + ...... + 400
(b) 1 + (1/2) + (1/3) + ...... + (1/20)
(c) 1 + (1/3) + (1/5) + ...... + (1/19)
(e) 2 - 4 + 6 - 8 + ...... - 20
(d) (1/2) + (2/3) + (3/4) + ...... + (19/20)
(f) (1*2) + (2*3) + ...... + (19*20)*/
import java.io.*;
public class SC8
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int suma = 0;
       double sumb=0, sumc=0, sumd=0, sume=0, sumf=0;
       for(int i=1;i<=20;i++)
       {
           suma=suma+(i*i);
       }
       System.out.println(suma);
       for(double i=1;i<=20;i++)
       {
           sumb=sumb+(1/i);
       }
       System.out.println(sumb);
       for(double i=1;i<=19;i=i+2)
       {
           sumc=sumc+(1/i);
       }
       System.out.println(sumc);
       double j = 2;
       for(double i=1;i<=19;i++)
       {
           sumd=sumd+(i/j);
           j++;
       }
       System.out.println(sumd);
       int h = 2;
       for(int i=2;i<=20;i=i+2)
       {
           sume = ((h%2)==0)?sume+i:sume-i;
           h++;
       }
       System.out.println(sume);
       j = 1;
       for(int i=2;i<=20;i++)
       {
           sumf=sumf+(i*j);
           j++;
       }
       System.out.println(sumf);
    }
}
