/*Write a program to input marks in English, Maths and Science of 40 students who have passed ICSE Examination 2014. Now, perform the following tasks:
(a) Number of students, who have secured 95% or more in all the subjects.
(b) Number of students, who have secured 90% or more in English, Maths and Science.*/
import java.io.*;
public class SC7
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int nems=0,nm=0,ne=0,ns=0;
       for(int i =0;i<40;i++)
       {
           System.out.println("ENTER YOUR MARKS IN ENGLISH:-");
           int e = Integer.parseInt(dis.readLine());
           System.out.println("ENTER YOUR MARKS IN MATHS:-");
           int m = Integer.parseInt(dis.readLine());
           System.out.println("ENTER MARKS IN SCIENCE:-");
           int s = Integer.parseInt(dis.readLine());
           nm = (m>=90)?nm+1:nm+0;
           ne = (m>=90)?ne+1:ne+0;
           ns = (m>=90)?ns+1:ns+0;
           if(nm<=95&&ne<=95&&ns<=95)
           {
               nems++;
           }
        }
       System.out.println("No. of students who have secured 95% or more in all subjects: " + nems);
       System.out.println("No. of students >= 90% in English: " + ne);
       System.out.println("No. of students >= 90% in Maths: " + nm);
       System.out.println("No. of students >= 90% in Science: " + ns);
    }
}