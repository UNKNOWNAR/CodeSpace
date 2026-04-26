/**/
import java.io.*;
public class Salary
{
    private int basic = 0;
    void input()throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Basic Pay:- ");
        basic  = Integer.parseInt(dis.readLine());
    }  
    void display()
    {
        double da = 0.3*basic;
        double hra = 0.1*basic;
        double gross = basic+da+hra;
        System.out.println("Your DA:-"+da);
        System.out.println("Your HRA:-"+hra);
        System.out.println("Your Gross Amount:-"+gross);
    }  
    public static void main(String args[]) throws IOException
    {        
        Salary obj = new Salary();
        obj.input();
        obj.display();       
    }
}