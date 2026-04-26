import java.io.*;
public class Number
{
    int n = 0;
    void input() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Number:- ");
        n  = Integer.parseInt(dis.readLine());
    }
    int getn()
    {
        return(n);
    }
    void display()
    {
        System.out.println(n);
    }  
}