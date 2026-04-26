import java.io.*;
public class Menudriven1
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int c = 5 ;    
        while(c==5)
        {
         System.out.println("Enter Number You Want To Take Input");
       int a = Integer.parseInt(dis.readLine());
    System.out.println(" THE NUMBER INPUTED BY YOU IS " + a);
    System.out.println(" IF YOU WANT TO CONTINUE TAKING ENTER PREES 5 ELSE PRESS 0 ");
     c = Integer.parseInt(dis.readLine());
}
}
}

        
        