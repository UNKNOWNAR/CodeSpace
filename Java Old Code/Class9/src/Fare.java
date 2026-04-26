/*A Pre-Paid taxi charges from the passenger as per the tariff given below:
Distance Rate
Up to 5 km ₹ 100
For the next 10 km ₹ 10/km
For the next 10 km ₹ 8/km
More than 25 km ₹ 5/km
Write a program to input the distance covered and calculate the amount paid by the passenger. The program displays the printed bill with the details given below:
Taxi No.                  :
Distance covered   :
Amount                  :*/
import java.io.*;
public class Fare
{
public static void main ( String args [])throws IOException
    {
       DataInputStream dis = new DataInputStream(System.in);
       /*System.out.println("ENTER TAXI NUMBER");
       String a1 = String.parse(dis.readLine());*/
       System.out.println("ENTER DISTANCE TRAVELLED BY YOU:-");
       int dist = Integer.parseInt(dis.readLine());
       int b,c,d = 0;
       int fare =100;
       if(dist>5)
       {
           b = (dist-5)>10?10:(dist-5);
           fare = fare + 10*b;
           if (dist>15)
           {
               c = (dist-15)>10?10:(dist-15);
               fare = fare + 8*c;
               if (dist>25)
               {
                   //calaculate fare
                   fare = fare + 5*(dist-25);
               }
            }
        }
      /* System.out.println("Taxi No.                  : "+a1);*/
       System.out.println("Distance covered   : "+dist);
       System.out.println("Amount                  : "+fare);
    }
}