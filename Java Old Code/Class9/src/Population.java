/*Question 6
The population of a country in a particular year can be calculated by:
p*(1+r/100) at the end of year 2000, where p is the initial population and r is the
growth rate.
Write a program by using a class to find the population of the country at the end of each year from 2001 to 2007. 
The Class has the following specifications:
Class name — Population
Data Members — float p,r
Member Methods:
Population(int a,int b) — Constructor to initialize p and r with a and b respectively.
void print() — to calculate and print the population of each year from 2001 to 2007.*/
import java.io.*;
public class Population
{
    int p;
    int r;
    Population(int a,int b)
    {
        p = a;
        r = b;
    }
    public void print()
    {
        int i = 2001;
        while(i<=2007)
        {
            p = (p*(100+r))/100;
            System.out.println("Population in "+i+" is:- "+p);
            i++;
        }
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Population in 2000:- ");
        int p  = Integer.parseInt(dis.readLine());
        System.out.println("Enter Rate:- ");
        int r  = Integer.parseInt(dis.readLine());
        Population obj = new Population(p,r);
        obj.print();
    }
}