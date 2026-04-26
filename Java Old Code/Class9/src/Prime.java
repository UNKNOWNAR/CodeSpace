/**/
import java.io.*;
public class Prime 
{
    private int n = 0;
    void input()throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Number:- ");
        n  = Integer.parseInt(dis.readLine());
    }  
    void checkprime()
    {
        int i = 1;
        int f = 0;
        while(i<n)
        {
            if(n%i==0)
            f++;
            i++;
        }
        if(f<2)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }  
    public static void main(String args[]) throws IOException
    {        
        Prime obj = new Prime();
        obj.input();
        obj.checkprime();       
    }
}