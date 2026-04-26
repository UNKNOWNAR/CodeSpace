/*Write a program to display the Mathematical Table from 5 to 10 for 10 iterations in the given format:
Sample Output: Table of 5
5*1 = 5
5*2 =10
--------
--------
5*10 = 50*/
import java.io.*;
public class SC91
{
    public static void main ( String args [])
    { 
        int i = 5,x=1;
        while(i<=10)
        {
            System.out.println("Table of "+i);
            while(x<=10)
            {
                System.out.println(i+"*"+x+" = "+(x*i));
                x++;
            }
            i++;
            x=1;
        }
    }
}
            
            