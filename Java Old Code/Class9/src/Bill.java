/*Define a class Bill that calculates the telephone bill of a consumer with the following description:
Data Members	Purpose
int bno	bill number
String name	name of consumer
int call	no. of calls consumed in a month
double amt	bill amount to be paid by the person
Member Methods	Purpose
Bill()	constructor to initialize data members with default initial value
Bill(...)	parameterised constructor to accept billno, name and no. of calls consumed
Calculate()	to calculate the monthly telephone bill for a consumer as per the table given below
Display()	to display the details
Units consumed	Rate
First 100 calls	₹0.60 / call
Next 100 calls	₹0.80 / call
Next 100 calls	₹1.20 / call
Above 300 calls	₹1.50 / call
Fixed monthly rental applicable to all consumers: ₹125
Create an object in the main() method and invoke the above functions to perform the desired task.*/
import java.io.*;
public class Bill
{
    String name;
    int bno;
    int call;
    double amt;
    Bill() 
    {
        name = "";
        bno = 0;
        call = 0;
        amt = 125;
    }
    Bill (String str,int x,int y)
    {
        name = str;
        bno = x;
        call = y;
    }
    public void Calculate() 
    {
        int b = call>100?100:call;
        amt += 0.6*b;
        b = call>200?100:(call-100);
        amt += 0.8*b;
        b = call>300?100:(call-200);
        amt += 1.2*b;
        b = call>300?(call-300):0;
        amt += 1.5*b;
    }
    public void Display() 
    {
        System.out.println("Bill No: " + bno);
        System.out.println("Name: " + name);
        System.out.println("Calls: " + call);
        System.out.println("Amount Payable: " + amt);
    }
    public static void main(String args[]) throws IOException
    {        
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Your Name:- ");
        String name  = dis.readLine();
        System.out.println("Enter Bill No:- ");
        int bno = Integer.parseInt(dis.readLine());
        System.out.println("Enter Number If Calls:- ");
        int call  = Integer.parseInt(dis.readLine());
        Bill obj = new Bill(name,bno,call);
        obj.Calculate();
        obj.Display();
    }
}