import java.io.*;     // import java io package
public class BusFare // declare class
{
    // declare main function
    public static void main ( String args [])throws IOException
    { 
       // create DataInputStream object to take input
       DataInputStream dis = new DataInputStream(System.in);
       // prompt user for input
       System.out.println("ENTER DISTANCE TRAVELLED:- ");
       // take user input and declare variables
       int dist = Integer.parseInt(dis.readLine());
       int b,c,d = 0;
       int fare =100; // setting base fare to hundred 
       // checking distance travelled above 10km
       if(dist>10)
       {
           // calculating excess distance greater than 10
           b = (dist-10)>10?10:(dist-10);
           // calculate fare
           fare = fare + 6*b;
           // checking distance travelled above 20 km
           if (dist>20)
           {
               // checking excess excess distance greater than 20
               c=(dist-20)>20?10:(dist-20);
               // calaculate fare
               fare = fare + 5*c;
               // checking distance travelled above 30 km  
               if (dist>30)
               {
                   //calaculate fare
                   fare = fare + 4*(dist-30);
               }
           }
       }   
       // dislaying the fare
       System.out.println("FARE:- " + fare);
    }
}