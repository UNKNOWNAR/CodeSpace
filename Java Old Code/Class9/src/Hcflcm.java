/*Question 1
Write a program by using a class with the following specifications:
Class name — Hcflcm
Data members/instance variables:
int a
int b
Member functions:
Hcflcm(int x, int y) — constructor to initialize a=x and b=y.
void calculate( ) — to find and print hcf and lcm of both the numbers.*/
import java.io.*;
public class Hcflcm
{
    int a;
    int b;
    Hcflcm(int x,int y)
    {
        a = x;
        b = y;
    }
    public void calculate()
    {
        int i = 2;
        int hcf = 1;
        int l = (a<b)?a:b;
        while(i<l)
        {
            if(a%i==0&&b%i==0)
                hcf = i;
            i++;
        }
        System.out.println("HCF of "+a+" and "+b+" is:- "+hcf);
        i = (a>b)?a:b;
        int lcm = a*b;
        while(i<(a*b))
        {
            if(i%a==0&&i%b==0)
            {
                lcm = i;
                break;
            }   
            i++;
        }
        System.out.println("LCM of "+a+" and "+b+" is:- "+lcm);
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter First Number:- ");
        int x = Integer.parseInt(dis.readLine());
        System.out.println("Enter Second Number:- ");
        int y  = Integer.parseInt(dis.readLine());
        Hcflcm no = new Hcflcm(x,y);
        no.calculate();
    }
}