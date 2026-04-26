/*In an entrance examination, students have answered English, Maths and Science papers. Write a program to calculate and display average marks obtained by all the students. Take number of students appeared and marks obtained in all three subjects by every student along with the name as inputs.*/
import java.io.*;
public class SC97
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number Of Students:- ");
       int n = Integer.parseInt(dis.readLine());
       int i = 0,tm=0;
       while(i!=n)
       {
           System.out.println("Enter Details of student "+i);
           System.out.println("ENTER YOUR NAME:-");
           String name= dis.readLine();
           System.out.println("ENTER YOUR MARKS IN ENGLISH:- ");
           int e = Integer.parseInt(dis.readLine());
           System.out.println("ENTER YOUR MARKS IN MATHS:- ");
           int m = Integer.parseInt(dis.readLine());
           System.out.println("ENTER YOUR MARKS IN SCIENCE:- ");
           int s = Integer.parseInt(dis.readLine());
           tm += e+m+s;
           double av = (e+m+s)/3;
           System.out.println("Average marks of " + name + " = " + av);
           i++;
       }
       double avg = tm/(n*3);
       System.out.println("Class Average = " +avg);
       }
    }

        