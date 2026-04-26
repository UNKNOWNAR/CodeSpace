import java.io.*;
public class proj2
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A Number:- ");
        int n = Integer.parseInt(dis.readLine());
        if(n>0)
        {
            if(n%2==0)
                System.out.println(n+ " is both a positive and even number");
            else 
                System.out.println(n+ " is both a positive and odd number");
        }       
        else if(n<0)
            System.out.println(n+ " is a negative number");
        else
            System.out.println(n+ " is zero");
    }
}