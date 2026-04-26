/*The basic salary of employees is undergoing a revision. Define a class called Grade_Revision with the following specifications:
Data Members	Purpose
String name	to store name of the employee
int bas	to store basic salary
int expn	to consider the length of service as an experience
double inc	to store increment
double nbas	to store new basic salary (basic + increment)
Member Methods	Purpose
Grade_Revision()	constructor to initialize all data members
void accept()	to input name, basic and experience
void increment()	to calculate increment based on experience as per the table given below
void display()	to print all the details of an employee
Experience	Increment
Up to 3 years	₹1,000 + 10% of basic
3 years or more and up to 5 years	₹3,000 + 12% of basic
5 years or more and up to 10 years	₹5,000 + 15% of basic
10 years or more	₹8,000 + 20% of basic
Write the main method to create an object of the class and call all the member methods.*/
import java.io.*;
public class Grade_Revision
{
    String name;
    int bas;
    int expn;
    double inc;
    double nbas;
    Grade_Revision()
    {
        name = "";
        bas =  0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }
    public void accept() throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Enter Your Name:- ");
        name  = dis.readLine();
        System.out.println("Enter Your Basic Salary:- ");
        bas  = Integer.parseInt(dis.readLine());
        System.out.println("Enter Your Experience:- ");
        expn  = Integer.parseInt(dis.readLine());
    }
    public void increment()
    {
        if(expn<=3)
        {
            inc = 1000+0.1*bas;
            nbas  = bas + inc;
        }
        if(expn>3&&expn<=5)
        {
            inc = 3000+0.12*bas;
            nbas  = bas + inc;
        }
        if(expn>5&&expn<=10)
        {
            inc = 5000+0.15*bas;
            nbas  = bas + inc;
        }
        if(expn>10)
        {
            inc = 8000+0.2*bas;
            nbas  = bas + inc;
        }
    }
    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Basic: " + bas);
        System.out.println("Experience: " + expn);
        System.out.println("Increment: " + inc);
        System.out.println("New Basic: " + nbas);
    }
    public static void main(String args[]) throws IOException
    {        
        Grade_Revision obj = new Grade_Revision();
        obj.accept();
        obj.increment();
        obj.display();
    }
}