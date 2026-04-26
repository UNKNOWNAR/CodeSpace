import java.io.*;
public class Notes
{
 public static void main ( String args [])throws IOException
    {
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER AMOUNT");
       int a = Integer.parseInt(dis.readLine());
       int i = 0;
       if((a/2000)>=1)
       {
           System.out.println("Number of 2000 notes needed "+a/2000);
           i = a/2000;
           a = a - ((a/2000)*2000);
       }
       if((a/500)>=1)
       {
           System.out.println("Number of 500 notes needed "+a/500);
           i = i + a/500;
           a = a - ((a/500)*500);
           
       }
       if((a/200)>=1)
       {
           System.out.println("Number of 200 notes needed "+a/200);
           i = i + a/200;
           a = a - ((a/200)*200);
       }
       if((a/100)>=1)
       {
           System.out.println("Number of 100 notes needed "+a/100);
           i = i + a/100;
           a = a - ((a/100)*100);
       }
       if((a/50)>=1)
       {
           System.out.println("Number of 50 notes needed "+a/50);
           i = i + a/50;
           a = a - ((a/50)*50);
       }
       if((a/20)>=1)
       {
           System.out.println("Number of 20 notes needed "+a/20);
           i = i + a/20;
           a = a - ((a/20)*20);
       }
       if((a/10)>=1)
       {
           System.out.println("Number of 10 notes needed "+a/10);
           i = i + a/10;
           a = a - ((a/10)*10);
       }
       if((a/5)>=1)
       {
           System.out.println("Number of 5 notes needed "+a/5);
           i = i + a/5;
           a = a - ((a/5)*5);
       }
       if((a/2)>=1)
       {
           System.out.println("Number of 2 notes needed "+a/2);
           i = i + a/2;
           a = a - ((a/2)*2);
       }
       if(a==1)
       {
           System.out.println("Number of 1 notes needed "+a);
           i = i + 1;
       }
       System.out.println("Total number of notes :- " + i);
    }
}

       
