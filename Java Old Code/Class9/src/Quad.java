/*Question 7
Write a program in Java to find the roots of a quadratic equation ax2+bx+c=0 with the following specifications:

Class name — Quad

Data Members — float a,b,c,d (a,b,c are the co-efficients & d is the discriminant), r1 and r2 are the roots of the equation.

Member Methods:

quad(int x,int y,int z) — to initialize a=x, b=y, c=z, d=0
void calculate() — Find d=b2-4ac
If d < 0 then print "Roots not possible" otherwise find and print:
r1 = (-b + √d) / 2a
r2 = (-b - √d) / 2a*/
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
public class Quad
{
    float a;
    float b;
    float c;
    float d;
    Quad(int x,int y,int z)
    {
        a = x;
        b = y;
        c = z;
        d = 0.0f;
    }
    public void calculate()
    {
        d = b*b-4*a*c;
        if(d<0)
            System.out.println("Roots not possible");
        else
        {
            double r1 = (-b+Math.sqrt(d))/(2*a);
            double r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println(r1+" and "+r2+" are the two roots of the equation ");
        }
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter a:- ");
        int a  = Integer.parseInt(dis.readLine());
        System.out.println("Enter b:- ");
        int b  = Integer.parseInt(dis.readLine());
        System.out.println("Enter c:- ");
        int c  = Integer.parseInt(dis.readLine());
        Quad obj = new Quad(a,b,c);
        obj.calculate();
    }
}