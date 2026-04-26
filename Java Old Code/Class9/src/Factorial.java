/**/
import java.io.*;
public class Factorial
{
    private int n = 0;
    void input()throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Number:- ");
        n  = Integer.parseInt(dis.readLine());
    }  
    void fact()
    {
        int i = 2;
        int fac = 1;
        while(i<=n)
        {
            fac *= i;
            i++;
        }
        System.out.println("Factorial of n is:- "+fac);
    }  
    public static void main(String args[]) throws IOException
    {        
        Factorial obj = new Factorial();
        obj.input();
        obj.fact();       
    }
}