/*Write a C program to input week number and print week day.*/
import java.io.*;
public class WeekDay
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER WEEK NUMBW+ER :-");
       int a = Integer.parseInt(dis.readLine());
       switch(a)
       {
           case 1: System.out.println("SUNDAY");
           break;
           case 2: System.out.println("MONDAY");
           break;
           case 3: System.out.println("TUESDAY");
           break;
           case 4: System.out.println("WEDNESDAY");
           break;
           case 5: System.out.println("THRUSDAY");
           break;
           case 6: System.out.println("FRIDAY");
           break;
           default: System.out.println("SATURDAY");
        }
    }
}